package com.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.model.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long>{}
