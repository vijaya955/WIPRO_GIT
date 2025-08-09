package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.user.service.UserServivceImpl;


@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserServivceImpl userservice;
	 
	
	@GetMapping("/getuserbyid/{id}")
	public ResponseEntity<User>  getuser(@PathVariable Long id){
		return ResponseEntity.ok(userservice.getuserbyid(id));
	}
	
	@PostMapping("/adduser")
	public ResponseEntity<User> adduser(@RequestBody User user){
		return ResponseEntity.ok(userservice.addUser(user));
	}
	
	@PutMapping("/updateuser")
	public ResponseEntity<User> updateuser(@RequestBody User user){
		return ResponseEntity.ok(userservice.updateuser(user));
	}
	
	@DeleteMapping("/deleteuser/{id}")
	public ResponseEntity<Void> deleteuser(@PathVariable Long id){
		userservice.deleteuser(id);
		return ResponseEntity.ok().build();
	}
	
}
