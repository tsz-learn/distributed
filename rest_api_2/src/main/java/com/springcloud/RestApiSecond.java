package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@EnableEurekaClient
@MapperScan("com.springcloud.mapper")
@SpringBootApplication
public class RestApiSecond {
    public static void main(String[] args) {
        SpringApplication.run(RestApiSecond.class,args);
    }
}
