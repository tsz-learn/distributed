package com.springcloud.controller;

import com.springcloud.model.City;
import com.springcloud.model.Country;
import com.springcloud.model.Province;
import com.springcloud.service.CityService;
import com.springcloud.service.CountryService;
import com.springcloud.service.ProvinceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class RestAPIController {

    @Autowired
    private CityService cityService;

    @Autowired
    private CountryService countryService;

    @Autowired
    private ProvinceService provinceService;

    @GetMapping("/get/city/{id}")
    public City getCityById(@PathVariable("id") Long id){
        return cityService.selectByPrimaryKey(id);
    }

    @GetMapping("/get/country/{id}")
    public Country getCountryById(@PathVariable("id") Long id){
        return countryService.selectByPrimaryKey(id);
    }

    @GetMapping("/get/province/{id}")
    public Province getProvinceById(@PathVariable("id") Long id){
        return provinceService.selectByPrimaryKey(id);
    }
}
