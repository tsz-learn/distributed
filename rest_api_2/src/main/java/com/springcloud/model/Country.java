package com.springcloud.model;

import java.util.Date;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Table: country
 */
@Data
@Table(name = "country",schema="test")
public class Country {
    /**
     * Column: id
     */
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY,generator="Mysql")
    private Integer id;

    /**
     * Column: name
     */
    private String name;

    /**
     * Column: area
     * Remark: 属于那个洲
     */
    private String area;

    /**
     * Column: time
     * Remark: 建国时间
     */
    private Date time;
}