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

	public List<User> listAllUser() {
		return repo.findAll();

	}
	public void createUser(User user) {
		  repo.save(user);
	}
	
	public Optional<User> getUsersById(Integer id) {
		return repo.findById(id);
	}
	
	public void deleteUser(Integer id) {
		repo.deleteById(id);
	}
	
	public void updateUser(User user, Integer id) {
		user.setFirstName(user.getFirstName());
		user.setLastName(user.getLastName());
		user.setPassword(user.getPassword());
		user.setEmail(user.getEmail());
		user.setPhoneNo(user.getPhoneNo());
		user.setId(id);
		repo.saveAndFlush(user);
	}

}