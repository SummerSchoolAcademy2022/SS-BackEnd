package com.summerschool.icecreamshop.model;
import javax.persistence.*;
import java.util.List;

@Entity
public class Basket {
    @Id
    @GeneratedValue
    private Integer id;
    private String sessionId;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "productId", nullable = false)
    private List<BasketProduct> basketProductList;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<BasketProduct> basketProducts;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public List<BasketProduct> getBasketProductList() {
        return basketProductList;
    }

    public void setBasketProductList(List<BasketProduct> basketProductList) {
        this.basketProductList = basketProductList;
    }
}
