package com.example.cartmicroservice.Repository;

import com.example.cartmicroservice.Models.ProductData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDataRepository extends JpaRepository<ProductData, Integer> {
}
