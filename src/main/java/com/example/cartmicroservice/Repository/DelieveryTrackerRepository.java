package com.example.cartmicroservice.Repository;

import com.example.cartmicroservice.Models.DelieveryTracker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DelieveryTrackerRepository extends JpaRepository<DelieveryTracker, Integer> {
}
