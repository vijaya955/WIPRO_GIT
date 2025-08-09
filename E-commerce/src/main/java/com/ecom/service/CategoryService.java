package com.ecom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.Category;
import com.ecom.repository.CategoryRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    // Create or update
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    // Get all
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    // Get by id
    public Optional<Category> getCategoryById(Long id) {
        return categoryRepository.findById(id);
    }

    // Delete by id
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}
