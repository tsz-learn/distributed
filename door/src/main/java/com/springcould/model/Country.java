package com.springcould.model;

import lombok.Data;
import java.util.Date;

/**
 * Table: country
 */
@Data
public class Country {
    /**
     * Column: id
     */
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