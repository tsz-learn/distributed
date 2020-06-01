package com.springcould.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.springcould.model.City;
import com.springcould.model.Country;
import com.springcould.model.Province;
import com.springcould.service.RestAPIService;

public class RestAPIServiceImpl implements RestAPIService {
    @Override
    @HystrixCommand(commandProperties = {
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "500")
    })
    public City getCityById(Long id) {
        City city=new City();
        city.setId(1L);
        city.setName("null");
        return city;
    }

    @Override
    public Country getCountryById(Long id) {
        return null;
    }

    @Override
    public Province getProvinceById(Long id) {
        return null;
    }
}
