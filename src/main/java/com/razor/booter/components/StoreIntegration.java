package com.razor.booter.components;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by paulhemmings on 1/15/16.
 * http://cloud.spring.io/spring-cloud-netflix/spring-cloud-netflix.html
 * https://github.com/Netflix/Hystrix/tree/master/hystrix-contrib/hystrix-javanica
 */

@Component
public class StoreIntegration {

    @HystrixCommand(fallbackMethod = "defaultStores")
    public Object getStores(Map<String, Object> parameters) {
        //do stuff that might fail
        return "something";
    }

    public Object defaultStores(Map<String, Object> parameters) {
        return "something useful";
    }

}
