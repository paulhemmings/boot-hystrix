package com.razor.booter;

import com.razor.booter.controllers.SampleController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

/**
 * Created by paulhemmings on 1/15/16.
 */

@SpringBootApplication
@EnableCircuitBreaker
public class Booter {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }

}
