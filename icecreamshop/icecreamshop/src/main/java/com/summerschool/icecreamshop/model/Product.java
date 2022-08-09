package com.summerschool.icecreamshop.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.persistence.*;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "title may be blank")
    private String title;
    @NotBlank(message = "shortDescription may be blank")
    private String shortDescription;
    private String longDescription;
    private String ingredients;
    @NotNull(message = "quantity may be null")
    private int quantity;
    private String alergens;
    @NotNull(message = "price may be null")
    private double price;
    @NotBlank(message = "currency may be blank")
    private String currency;
    private String photoUrl;
    @NotNull(message = "Type may be null")
    private ProductType type;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "categoryId", nullable = false)
    private Category category;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Rate> rate;
}