package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.model.User;
import com.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@GetMapping("/getuserbyid/{id}")
	public ResponseEntity<User> getuserbyid(@PathVariable Long id) {
		return ResponseEntity.ok(userservice.getUserById(id));
	}
	
	@GetMapping("/getusers")
	public ResponseEntity<List<User>> getusers() {
		return ResponseEntity.ok(userservice.getUsers());
	}
	
	@PostMapping("/adduser")
	public ResponseEntity<User> addUser(@RequestBody User user) {
	    User savedUser = userservice.addUser(user);
	    return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
	}

	
	@PutMapping("/updateuser")
	public ResponseEntity<User> updateuser(@RequestBody User user){
		return ResponseEntity.ok(userservice.updateUser(user));
	}
	
	@DeleteMapping("/deleteuser/{id}")
	public ResponseEntity<Void> deleteUser(@PathVariable Long id){
		userservice.deleteUser(id);
		return ResponseEntity.noContent().build();
	}

}