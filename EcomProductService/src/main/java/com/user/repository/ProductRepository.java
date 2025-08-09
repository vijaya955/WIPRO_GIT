package com.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.user.model.Product;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByNameContaining(String name);
    List<Product> findByCategory_Name(String categoryName);
}
