package com.connect.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.connect.model.User;

@FeignClient(name = "user-service", url = "http://localhost:9001")
public interface DetailsService {

    @GetMapping("/user/getuserbyid/{id}")
    User getUserbyId(@PathVariable("id") Long userId);
}
