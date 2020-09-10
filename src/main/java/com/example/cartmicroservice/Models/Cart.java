package com.example.cartmicroservice.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "carts")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "userid", nullable = false)
    private User user;

    @OneToMany(mappedBy = "cart", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<ProductData> productDataList;

    int totalPrice;

    public Cart(User user, List<ProductData> productDataList, int totalPrice) {
        this.user = user;
        this.productDataList = productDataList;
        this.totalPrice = totalPrice;
    }

    public Cart() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<ProductData> getProductDataList() {
        return productDataList;
    }

    public void setProductDataList(List<ProductData> productDataList) {
        this.productDataList = productDataList;
    }

    public void addProductDataToList(ProductData productData) {
        productDataList.add(productData);
    }

    public void removeProductDataFromList(int productDataId) {
        for (ProductData productData : productDataList) {
            if (productData.getId() == productDataId) {
                productDataList.remove(productData);
                break;
            }
        }
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}
