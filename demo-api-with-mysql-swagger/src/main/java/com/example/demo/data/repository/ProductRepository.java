package com.example.demo.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.data.entity.Product;

public interface ProductRepository extends JpaRepository<Product, String> {
}
