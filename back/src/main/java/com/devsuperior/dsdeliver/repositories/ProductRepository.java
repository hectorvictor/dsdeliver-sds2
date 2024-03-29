package com.devsuperior.dsdeliver.repositories;

import java.util.List;

import com.devsuperior.dsdeliver.entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
    
    List<Product> findAllByOrderByNameAsc();
}
