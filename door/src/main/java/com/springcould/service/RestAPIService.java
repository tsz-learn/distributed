package com.springcould.service;

import com.springcould.model.City;
import com.springcould.model.Country;
import com.springcould.model.Province;
import com.springcould.service.impl.RestAPIServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "GATE-WAY-MAIN",fallback = RestAPIServiceImpl.class)
public interface RestAPIService {
    @GetMapping("/get/city/{id}")
    City getCityById(@PathVariable("id") Long id);

    @GetMapping("/get/country/{id}")
    Country getCountryById(@PathVariable("id") Long id);

    @GetMapping("/get/province/{id}")
    Province getProvinceById(@PathVariable("id") Long id);
}
