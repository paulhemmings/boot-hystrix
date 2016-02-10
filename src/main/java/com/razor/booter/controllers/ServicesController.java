package com.razor.booter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by paul.hemmings on 2/10/16.
 */

@Controller
public class ServicesController {


    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * Discover the root URLs for all services with that name
     * @param serviceName
     * @return
     */

    public Optional<String> serviceUrl(String serviceName) {

        List<String> list = new ArrayList<>();
        discoveryClient.getInstances(serviceName)
                .forEach(serviceInstance -> list.add(serviceInstance.getUri().toString()));

        if (list.size() > 0) {
            return Optional.of(list.get(0));
        }

        return Optional.empty();
    }

    /**
     * Retrieve the root URL for the Stores Service
     * @return
     */

    @RequestMapping("/service/stores")
    @ResponseBody
    String stores() {
        Optional<String> url = this.serviceUrl("STORES-SERVICE");
        return url.isPresent() ? url.get() : "no service found";
    }

}
