package com.summerschool.icecreamshop.model;

import javax.persistence.*;

@Entity
public class BasketProduct {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id

    private Long id;
    private Long productId;
    private Double price;
    private Integer quantity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductid() {
        return productId;
    }

    public void setProductid(Long productid) {
        this.productId = productId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BasketProduct() {

    }


}





