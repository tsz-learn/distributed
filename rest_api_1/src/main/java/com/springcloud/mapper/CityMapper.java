package com.springcloud.mapper;

import com.springcloud.model.City;
import tk.mybatis.mapper.common.Mapper;

public interface CityMapper extends Mapper<City> {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(City record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(City record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    City selectByPrimaryKeyWithLock(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    City selectByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(City record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(City record);
}