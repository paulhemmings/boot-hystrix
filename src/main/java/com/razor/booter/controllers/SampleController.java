package com.razor.booter.controllers;

import com.razor.booter.components.StoreIntegration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

/*
 * Sample controller
 * http://projects.spring.io/spring-boot/#quick-start
 * http://cloud.spring.io/spring-cloud-netflix/

 * mavenBom
 * https://spring.io/blog/2015/02/23/better-dependency-management-for-gradle

 * class not found: ModelBuildingException
 * https://github.com/spring-gradle-plugins/dependency-management-plugin/issues/54

 */

@Controller
@EnableAutoConfiguration
@EnableEurekaClient
public class SampleController {

    @Autowired
    StoreIntegration storeIntegration;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return storeIntegration.getStores();
    }
}
