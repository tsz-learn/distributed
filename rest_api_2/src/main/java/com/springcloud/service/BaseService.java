package com.springcloud.service;

public interface BaseService<T> {

    T selectByPrimaryKey(Long id);

    int insert(T code);

    int updateByPrimaryKey(T newCode);

    int deleteByPrimaryKey(Long id);
}
