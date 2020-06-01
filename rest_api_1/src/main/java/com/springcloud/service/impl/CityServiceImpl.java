package com.springcloud.service.impl;

import com.springcloud.mapper.CityMapper;
import com.springcloud.model.City;
import com.springcloud.service.CityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

@Service
public class CityServiceImpl implements CityService {
    @Resource
    private CityMapper cityMapper;

    @Override
    public City selectByPrimaryKey(Long id) {
        return cityMapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional
    public int insert(City code) {
        return cityMapper.insert(code);
    }

    @Override
    @Transactional
    public int updateByPrimaryKey(City newCode) {
        return cityMapper.updateByPrimaryKey(newCode);
    }

    @Override
    @Transactional
    public int deleteByPrimaryKey(Long id) {
        return cityMapper.deleteByPrimaryKey(id);
    }
}
