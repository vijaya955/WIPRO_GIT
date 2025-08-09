package com.contact.external;

import com.contact.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "USER-SERVICE") // Name registered in Eureka
public interface UserClient {

    @GetMapping("/users/{userId}")
    User getUserById(@PathVariable("userId") Long userId);
}
