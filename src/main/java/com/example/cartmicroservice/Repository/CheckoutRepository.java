package com.example.cartmicroservice.Repository;

import com.example.cartmicroservice.Models.CheckOut;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckoutRepository extends JpaRepository<CheckOut, Integer> {
}
