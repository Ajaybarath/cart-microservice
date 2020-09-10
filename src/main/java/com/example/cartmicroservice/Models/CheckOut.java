package com.example.cartmicroservice.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "checkouts")
public class CheckOut {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "userid", nullable = false)
    private User user;

    @OneToMany(mappedBy = "checkout", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<ProductData> productDataList;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "addressid", nullable = false)
    private Address address;

    private String promocode;

    private int totalCost;

    private int discount;

    private int finalCost;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "paymentid" ,nullable = false)
    private Payment payment;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "delieveryid" ,nullable = false)
    private DelieveryTracker delieveryTracker;
}
