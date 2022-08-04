package com.summerschool.icecreamshop.model;

import javax.persistence.*;

@Entity
@Table
public class Rate {
    @Id
    private int id;
    @Column
    private int productId;
    @Column
    private int rate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}