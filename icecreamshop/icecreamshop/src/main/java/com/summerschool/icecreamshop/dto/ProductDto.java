package com.summerschool.icecreamshop.dto;


import com.summerschool.icecreamshop.model.*;

import java.util.ArrayList;
import java.util.List;

public class ProductDto {
    private Long id;
    private String title;
    private String shortDescription;
    private String longDescription;
    private String ingredients;
    private int quantity;
    private String alergens;
    private double price;
    private String currency;
    private String photoUrl;
    private ProductType type;

    private Category category;

    private List<BasketProduct> basketProduct = new ArrayList<>();

    private List<Rate> rate = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getAlergens() {
        return alergens;
    }

    public void setAlergens(String alergens) {
        this.alergens = alergens;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<BasketProduct> getBasketProduct() {
        return basketProduct;
    }

    public void setBasketProduct(List<BasketProduct> basketProduct) {
        this.basketProduct = basketProduct;
    }

    public List<Rate> getRate() {
        return rate;
    }

    public void setRate(List<Rate> rate) {
        this.rate = rate;
    }

    public ProductDto(Long id, String title, String shortDescription, String longDescription, String ingredients, int quantity, String alergens, double price, String currency, String photoUrl, ProductType type, Category category, List<BasketProduct> basketProduct, List<Rate> rate) {
        this.id = id;
        this.title = title;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.ingredients = ingredients;
        this.quantity = quantity;
        this.alergens = alergens;
        this.price = price;
        this.currency = currency;
        this.photoUrl = photoUrl;
        this.type = type;
        this.category = category;
        this.basketProduct = basketProduct;
        this.rate = rate;
    }
}
