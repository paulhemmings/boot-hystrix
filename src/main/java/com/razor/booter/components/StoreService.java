package com.razor.booter.components;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by paulhemmings on 1/15/16.
 * http://cloud.spring.io/spring-cloud-netflix/spring-cloud-netflix.html
 * https://github.com/Netflix/Hystrix/tree/master/hystrix-contrib/hystrix-javanica
 */

@Service("storeService")
public class StoreService {

    @HystrixCommand(fallbackMethod = "defaultStores")
    public String getStores() {
        //do stuff that might fail
        return "something";
    }

    public String defaultStores() {
        return "something useful";
    }

}
