package com.example.cartmicroservice.Models;

import java.io.Serializable;

public class Address implements Serializable {

    private int id;
    private String name;
    private String line1;
    private String line2;
    private String city;
    private String state;
    private String country;
    private int pincode;
    private User user;

    public Address(int id, String name, String line1, String line2, String city, String state, String country, int pincode, User user) {
        this.id = id;
        this.name = name;
        this.line1 = line1;
        this.line2 = line2;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
        this.user = user;
    }

    public Address() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLine1() {
        return line1;
    }

    public String getLine2() {
        return line2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public int getPincode() {
        return pincode;
    }

    public User getUser() {
        return user;
    }
}
