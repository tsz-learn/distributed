package com.springcloud.mapper;

import com.springcloud.model.Province;
import tk.mybatis.mapper.common.Mapper;

public interface ProvinceMapper extends Mapper<Province> {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(Province record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(Province record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    Province selectByPrimaryKeyWithLock(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    Province selectByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(Province record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(Province record);
}