package com.summerschool.icecreamshop.model;
import java.util.List;

public class Basket {
    private Integer id;
    private String sessionId;
    private List<BasketProduct> basketProductList;

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
