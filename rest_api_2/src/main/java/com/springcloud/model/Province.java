package com.springcloud.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Table: province
 */
@Data
@Table(name = "province",schema="test")
public class Province {
    /**
     * Column: id
     */
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY,generator="Mysql")
    private Long id;

    /**
     * Column: name
     */
    private String name;

    /**
     * Column: parent_id
     */
    private String parentId;
}