package com.example.cartmicroservice.Models;

import javax.persistence.*;

@Entity
@Table(name = "productdata")
public class ProductData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //Product details
    private int productId;
    private String name;
    private String description;
    private int mrp;
    private int discount;

    //quantity
    private int quantity;

    private int price;

    private int totalPrice;

    public ProductData(int productid, String name, String description, int mrp, int discount, int quantity) {
        this.productId = productid;
        this.name = name;
        this.description = description;
        this.mrp = mrp;
        this.discount = discount;
        this.quantity = quantity;

        this.price = ((mrp * discount) / 100);
        this.totalPrice = quantity * price;
    }

    public ProductData() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
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
        this.price = ((mrp * discount) / 100);


    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
        this.price = ((mrp * discount) / 100);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        this.totalPrice = quantity * price;
    }

    public int getPrice() {
        return price;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

}
