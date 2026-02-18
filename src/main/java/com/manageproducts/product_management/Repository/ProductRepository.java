package com.manageproducts.product_management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manageproducts.product_management.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}