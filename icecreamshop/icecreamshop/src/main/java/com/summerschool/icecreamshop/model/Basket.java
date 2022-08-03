package com.summerschool.icecreamshop.model;
import java.util.List;

public class Basket {
    private Integer id;
    private String sessionid;
    private List<BasketProduct> basketProductList;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id){
        this.id=id;
    }

    public String getSessionid(){
        return sessionid;
    }

    public void setSessionid(String sessionid){
        this.sessionid=sessionid;

    }

     Basket b= new Basket(Integer id, String sessionid){
        this.id=id;
        this.sessionid=sessionid;
     }

}
