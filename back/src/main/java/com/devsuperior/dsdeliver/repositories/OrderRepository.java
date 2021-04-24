package com.devsuperior.dsdeliver.repositories;

import java.util.List;

import com.devsuperior.dsdeliver.entity.Order;

import org.springframework.data.jpa.repository.JpaRepository;



public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findAllByOrderByAddressAsc();
    
}
