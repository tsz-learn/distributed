package com.springcloud.service.impl;

import com.springcloud.mapper.CountryMapper;
import com.springcloud.model.Country;
import com.springcloud.service.CountryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

@Service
public class CountryServiceImpl implements CountryService {

    @Resource
    private CountryMapper countryMapper;

    @Override
    public Country selectByPrimaryKey(Long id) {
        return countryMapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional
    public int insert(Country code) {
        return countryMapper.insert(code);
    }

    @Override
    @Transactional
    public int updateByPrimaryKey(Country newCode) {
        return countryMapper.updateByPrimaryKey(newCode);
    }

    @Override
    @Transactional
    public int deleteByPrimaryKey(Long id) {
        return countryMapper.deleteByPrimaryKey(id);
    }
}
