package com.example.AngularCrud.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long id;
    private String name;
    private String category;

    private Date date;
    private String productFreshness;
    private String price;
    private String comment;

    public Product() {
    }

    public Product(long id, String name, String category, Date date ,String productFreshness, String price, String comment) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.category = category;
        this.productFreshness = productFreshness;
        this.price = price;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProductFreshness() {
        return productFreshness;
    }

    public void setProductFreshness(String productFreshness) {
        this.productFreshness = productFreshness;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
