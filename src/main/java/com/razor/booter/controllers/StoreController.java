package com.razor.booter.controllers;

import com.razor.booter.components.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

/*
 * RESTful controller.
 * This will automatically register this service with the Service Registry (Eureka)
 */


/*
 * http://projects.spring.io/spring-boot/#quick-start
 * http://cloud.spring.io/spring-cloud-netflix/

 * mavenBom
 * https://spring.io/blog/2015/02/23/better-dependency-management-for-gradle

 * class not found: ModelBuildingException
 * https://github.com/spring-gradle-plugins/dependency-management-plugin/issues/54
 */


@Controller
@EnableEurekaClient
public class StoreController {

    @Autowired
    StoreService storeService;

    /**
     * RESTFul service endpoint that returns all the stores
     * @return
     */

    @RequestMapping("/api/stores")
    @ResponseBody
    String stores() {
        return storeService.getStores();
    }
}
