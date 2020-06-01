package com.springcloud.service.impl;

import com.springcloud.mapper.ProvinceMapper;
import com.springcloud.model.Province;
import com.springcloud.service.ProvinceService;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

@Service
public class ProvinceServiceImpl implements ProvinceService {

//    @Resource
//    private SqlSessionFactory sqlSessionFactoryBean;

    @Resource
    private ProvinceMapper provinceMapper;

    @Override
    public Province selectByPrimaryKey(Long id) {
//        sqlSessionFactoryBean.openSession(ExecutorType.BATCH,true);  //开启批处理

        return provinceMapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional
    public int insert(Province code) {
        return provinceMapper.insert(code);
    }

    @Transactional
    @Override
    public int updateByPrimaryKey(Province newCode) {
        return provinceMapper.updateByPrimaryKey(newCode);
    }

    @Override
    @Transactional
    public int deleteByPrimaryKey(Long id) {
        return provinceMapper.deleteByPrimaryKey(id);
    }
}
