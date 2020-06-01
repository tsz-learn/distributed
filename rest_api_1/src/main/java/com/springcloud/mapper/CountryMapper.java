package com.springcloud.mapper;


import com.springcloud.model.Country;
import tk.mybatis.mapper.common.Mapper;

public interface CountryMapper extends Mapper<Country> {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(Country record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(Country record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    Country selectByPrimaryKeyWithLock(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    Country selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(Country record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(Country record);
}