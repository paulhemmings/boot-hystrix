package com.razor.booter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by paulhemmings on 1/15/16.
 */


@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableCircuitBreaker
public class Booter {

    public static void main(String[] args) {
        SpringApplication.run(Booter.class, args);
    }

}
