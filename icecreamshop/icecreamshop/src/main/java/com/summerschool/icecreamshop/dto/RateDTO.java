package com.summerschool.icecreamshop.dto;

import com.summerschool.icecreamshop.model.Product;

public class RateDTO {
    private Long id;
    private int rate;
    private Product product;

    public RateDTO() {
    }

    public RateDTO(Long id, int rate, Product product) {
        this.id = id;
        this.rate = rate;
        this.product = product;
    }

    public RateDTO(Long id, int rate) {
        this.id = id;
        this.rate = rate;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
