package com.summerschool.icecreamshop.dto;

import com.sun.istack.NotNull;

import java.util.List;

public class CategoryDTO {
    private Long id;

    @NotNull
    private String name;

    private String description;

    private List<ProductDTO> products;


    public CategoryDTO() {
    }

    public CategoryDTO(Long id, String name, String description, List<ProductDTO> products) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.products = products;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<ProductDTO> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDTO> products) {
        this.products = products;
    }

    }

