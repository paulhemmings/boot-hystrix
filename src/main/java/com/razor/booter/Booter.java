package com.razor.booter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by paulhemmings on 1/15/16.
 *
 * Spring Boot.
 * $ gradle clean build bootRun
 *
 * Options for running the web app
 * https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-gradle-plugin.html#build-tool-plugins-gradle-repackage-configuration
 *
 * Configuration <- loads in configuration from the application/bootstrap.yml
 * EnableAutoConfiguration <- not sure
 * ComponentScan <- go find all the controllers
 */


@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Booter {

    public static void main(String[] args) {
        SpringApplication.run(Booter.class, args);
    }

}
