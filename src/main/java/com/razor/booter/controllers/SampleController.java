package com.razor.booter.controllers;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

/*
 * Sample controller
 * http://projects.spring.io/spring-boot/#quick-start
 * http://cloud.spring.io/spring-cloud-netflix/
 */

@Controller
@EnableAutoConfiguration
@EnableEurekaClient
@RestController
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}
