package com.peishujuan.springcloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class GatewayApplicatin {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplicatin.class,args);
    }
}
