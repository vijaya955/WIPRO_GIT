package com.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {}

