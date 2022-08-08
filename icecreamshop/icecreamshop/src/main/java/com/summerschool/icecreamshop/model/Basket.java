package com.summerschool.icecreamshop.model;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Basket {
    @Id
    @GeneratedValue
    private Long id;
    private String sessionId;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BasketProduct> basketProduct = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public List<BasketProduct> getBasketProduct() {
        return basketProduct;
    }

    public void setBasketProduct(List<BasketProduct> basketProduct) {
        this.basketProduct = basketProduct;
    }
}
