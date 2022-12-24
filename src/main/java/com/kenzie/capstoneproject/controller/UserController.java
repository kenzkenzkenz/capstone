package com.kenzie.capstoneproject.controller;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kenzie.capstoneproject.model.User;
import com.kenzie.capstoneproject.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService service;
	
	@GetMapping("/admin/user")
	public List<User> listALL(){
		System.out.println("Testing");
		return service.listAllUser();
	}
	
//	@GetMapping("/user/{id}")
//	public ResponseEntity<Optional<User>> getUserById(@PathVariable Integer id){
//		try {
//		Optional<User> user=service.getUsersById(id);
//		System.out.println(user);
//		return new ResponseEntity<>(user,HttpStatus.OK);//200
//		}catch(NoSuchElementException e) {
//			return null;//404
//		}
//	}
	
	@GetMapping("/admin/user/{id}")
    public ResponseEntity<Optional<User>> selectUserById(@PathVariable Integer id){
        try {
            Optional<User> foundUser = service.getUserById(id);
            return new ResponseEntity<>(foundUser, HttpStatus.OK);
        } catch(NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
	}
        
	
	@PostMapping("/user")
	public void addUser(@RequestBody User user) {
		service.createUser(user);
	}
	
	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable Integer id) {
		service.deleteUser(id);
	}
	

	@PutMapping("/user/{id}")
	public void updateUser(@RequestBody User user, @PathVariable Integer id) {
		service.updateUser(user, id);
	}
	
}
