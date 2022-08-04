package com.summerschool.icecreamshop.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;



@Entity
public class Product {
    public enum Type {ICE_CREAM, GELATO, DONUTS, MERCHANDISE}
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "title may be blank")
    private String title;
    @NotBlank(message = "shortDescription may be blank")
    private String shortDescription;
    private String longDescription;
    private String ingredients;
    @NotNull(message = "quantity may be null")
    private Integer quantity;
    private String alergens;
    @NotNull(message = "price may be null")
    private Float price;
    @NotBlank(message = "currency may be blank")
    private String currency;
    private String photoUrl;
    @NotNull(message = "Type may be null")
    private Type type;
    @NotNull(message = "categoryId may be null")
    private Integer categoryId;

    public Product() {
    }

    public Product(Integer id, String title, String shortDescription, String longDescription, String ingredients, Integer quantity, String alergens, Float price, String currency, String photoUrl, Type type, Integer categoryId) {
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
        this.categoryId = categoryId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getAlergens() {
        return alergens;
    }

    public void setAlergens(String alergens) {
        this.alergens = alergens;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
}
