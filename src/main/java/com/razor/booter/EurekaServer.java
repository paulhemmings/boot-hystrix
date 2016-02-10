package com.razor.booter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by paul.hemmings on 2/9/16.
 */

/**
 * https://ahus1.github.io/hystrix-examples/manual.html#_ensuring_a_clean_start_up_and_shut_down_of_hystrix
 * http://cloud.spring.io/spring-cloud-netflix/
 * http://jobcoding.net/feed/view?feedIdx=37505
 * http://localhost:8761/
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer.class, args);
    }
}
