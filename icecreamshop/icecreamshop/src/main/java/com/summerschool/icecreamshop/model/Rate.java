package com.summerschool.icecreamshop.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Rate {
    @Id
    private long id;
    private int rate;

    @ManyToOne
    @JoinColumn(name="productId", nullable=false)
    private Product product;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}