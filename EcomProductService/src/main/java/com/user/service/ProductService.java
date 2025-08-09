package com.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.user.model.Product;
import com.user.repository.ProductRepository;
import java.util.List;

@Service
public class ProductService{

    @Autowired
    private ProductRepository productRepo;
    
    public Product createProduct(Product product) {
        return productRepo.save(product);
    }

    public Product getProductById(Long id) {
        return productRepo.findById(id).orElse(null);
    }

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public List<Product> searchByName(String name) {
        return productRepo.findByNameContaining(name);
    }

    public List<Product> filterByCategory(String categoryName) {
        return productRepo.findByCategory_Name(categoryName);
    }

    public Product updateProduct(Long id, Product updatedProduct) {
        Product existing = getProductById(id);
        if (existing == null) return null;

        existing.setName(updatedProduct.getName());
        existing.setDescription(updatedProduct.getDescription());
        existing.setPrice(updatedProduct.getPrice());
        existing.setCategory(updatedProduct.getCategory());

        return productRepo.save(existing);
    }

    public void deleteProduct(Long id) {
        productRepo.deleteById(id);
    }
}

