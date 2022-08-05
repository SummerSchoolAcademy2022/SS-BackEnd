package com.summerschool.icecreamshop.model;

import javax.persistence.*;
import java.util.List;
@Entity
public class Basket {
    @GeneratedValue (strategy= GenerationType.AUTO)
    @Id
    private Long id;

    @OneToMany
    private List<BasketProduct> basketProductList;
    private String sessionId;
    public Basket(){
    }
    public List<BasketProduct> getBasketProductList() {
        return basketProductList;
    }
    public void setBasketProductList(List <BasketProduct> basketProductList){
        this.basketProductList= basketProductList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }

    public String getSessionId(){
        return sessionId;
    }

    public void setSessionId(String sessionId){
        this.sessionId=sessionId;


    }
}
