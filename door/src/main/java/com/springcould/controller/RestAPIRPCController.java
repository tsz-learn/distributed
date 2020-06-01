package com.springcould.controller;

import com.springcould.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Rest API RPC的调用
 */
@RestController
public class RestAPIRPCController {

    private static String URI="GATE-WAY-MAIN";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/get/city/{id}")
    public City getCity(@PathVariable("id") Long id) {
        return restTemplate.getForObject("http://"+URI+"/get/city/"+id,City.class);
    }
}
