package com.example.cartmicroservice.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "wishlist")
public class WishList {

    private int id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "userid", nullable = false)
    private User user;

    @OneToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    private List<ProductData> productData;
}
