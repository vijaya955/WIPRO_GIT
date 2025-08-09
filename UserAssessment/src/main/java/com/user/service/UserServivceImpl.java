package com.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.user.model.User;
import com.user.repository.UserRepository;
@Service
public class UserServivceImpl {

	@Autowired
	private UserRepository repo;
	
	public User getuserbyid(Long id) {
	    return repo.findById(id).orElse(null);
	}
	
	public User addUser(User user) {
		return repo.save(user);
	}
	
	public User updateuser(User user) {
		return repo.save(user);
	}
	
	public void deleteuser(Long userId) {
		repo.deleteById(userId);
	}

}
