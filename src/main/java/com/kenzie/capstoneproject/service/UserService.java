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
	@Autowired
    private EmailService service;

	//GET ALL USERS
	public List<User> listAllUser() {
		return repo.findAll();
	}
	
//	//CREATE USER (OLD & BASIC). this worked fine
//	public void createUser(User user) {
//		  repo.save(user);
//	}
	
	public String createUser(User user) { //CREATE USER & SEND WELCOME EMAIL
		
        boolean emailExists = repo.findByEmail(user.getEmail()).isPresent();
        if(emailExists) {
            throw new IllegalStateException("Email already taken");
        }
        
        repo.save(user);
        service.sendEMail("Kenzie", user.getEmail(), "WELCOME", user.getFirstName() + ", thanks for registering.");

        return "Registered";
	}
	
	//GET USER
	public Optional<User> getUserById(Integer id) {
		return repo.findById(id);
	}
	
	//DELETE USER
	public void deleteUser(Integer id) {
		repo.deleteById(id);
	}
	
	//UPDATE USER
	public void updateUser(User user, Integer id) {
		user.setEmail(user.getEmail());
		user.setPassword(user.getPassword());
		user.setFirstName(user.getFirstName());
		user.setLastName(user.getLastName());
		user.setAddresses(user.getAddresses());
		user.setUserId(id);
		repo.saveAndFlush(user);
	}

}
