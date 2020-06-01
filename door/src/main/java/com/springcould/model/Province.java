package com.springcould.model;

import lombok.Data;

/**
 * Table: province
 */
@Data
public class Province {
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