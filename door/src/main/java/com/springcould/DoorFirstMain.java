package com.springcould;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
@EnableFeignClients(basePackages = "com.springcloud.service")
public class DoorFirstMain {
    public static void main(String[] args) {
        SpringApplication.run(DoorFirstMain.class,args);
    }
}
