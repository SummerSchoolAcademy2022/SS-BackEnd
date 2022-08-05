package com.summerschool.icecreamshop.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class BasketProduct {
   // @Id
   // Integer idPk;

    @ManyToOne(fetch = FetchType.EAGER,optional = false)
    @JoinColumn(name = "PRODUCT_ID", nullable = false)
    private Product product;

    @ManyToOne(fetch = FetchType.EAGER,optional = false)
    @JoinColumn(name = "ID", nullable = false)
    private Basket basket;

    private List<Product> products;

    private Double price;
    private Integer quantity;
    private Basket id;

    public Basket getId() {
        return id;
    }

    public void setId(Basket id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
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
}





