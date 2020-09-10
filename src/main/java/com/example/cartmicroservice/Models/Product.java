package com.example.cartmicroservice.Models;

public class Product {

    private int id;
    private String name;
    private String description;
    private int mrp;
    private int discount;

    public Product(int id, String name, String description, int mrp, int discount) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.mrp = mrp;
        this.discount = discount;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMrp() {
        return mrp;
    }

    public void setMrp(int mrp) {
        this.mrp = mrp;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
