package com.devsuperior.dsdeliver.repositories;

import com.devsuperior.dsdeliver.entity.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
