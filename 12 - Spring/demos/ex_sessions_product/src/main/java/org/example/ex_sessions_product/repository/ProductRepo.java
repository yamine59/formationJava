package org.example.ex_sessions_product.repository;

import org.example.ex_sessions_product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
}
