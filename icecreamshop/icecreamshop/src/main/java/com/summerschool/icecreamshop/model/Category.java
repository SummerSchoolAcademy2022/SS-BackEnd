package com.summerschool.icecreamshop.model;

import javax.persistence.*;

@Entity
@Table
public class Category {
    @Id
    private int categoryId;
    @Column
    private String name;
    @Column
    private String description;


    public int getId() {
        return categoryId;
    }

    public void setId(int id) {
        this.categoryId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
