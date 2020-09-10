package com.example.cartmicroservice.Models;

import java.io.Serializable;
import java.util.Set;

public class User implements Serializable {

    private int id;
    private String name;
    private String username;
    private String email;
    private String phone;
    private Set<Address> addressSet;

    public User() {
    }

    public User(int id, String name, String username, String email, String phone, Set<Address> addressSet) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.addressSet = addressSet;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Set<Address> getAddressSet() {
        return addressSet;
    }
}
