package com.kenzie.capstoneproject.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kenzie.capstoneproject.model.User;
import com.kenzie.capstoneproject.repo.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repo;

	//READ/GET all users
	public List<User> listAllUser() {
		return repo.findAll();

	}
	
	//CREATE/POST user
	public void createUser(User user) {
		  repo.save(user);
	}
	
	//READ/GET user
	public Optional<User> getUsersById(Integer id) {
		return repo.findById(id);
	}
	
	//DELETE user
	public void deleteUser(Integer id) {
		repo.deleteById(id);
	}
	
	//UPDATE/PUT user
	public void updateUser(User user, Integer id) {
		user.setUserName(user.getUserName());
		user.setPassword(user.getPassword());
		user.setFirstName(user.getFirstName());
		user.setLastName(user.getLastName());
		user.setEmail(user.getEmail());
		user.setPhoneNo(user.getPhoneNo());
		user.setUserId(id);
		repo.saveAndFlush(user);
	}

}
