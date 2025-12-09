package com.example.demo.repository;

import com.example.demo.entity.Basket;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BasketRepository extends JpaRepository<Basket, Long> {
    List<Basket> findByOrderId(Long orderId);
}
