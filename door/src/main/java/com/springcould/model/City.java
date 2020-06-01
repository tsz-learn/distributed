package com.springcould.model;

import lombok.Data;

/**
 * Table: city
 */
@Data
public class City {
    /**
     * Column: id
     */
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