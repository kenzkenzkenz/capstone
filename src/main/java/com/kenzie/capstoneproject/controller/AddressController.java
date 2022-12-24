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

import com.kenzie.capstoneproject.model.Address;
import com.kenzie.capstoneproject.service.AddressService;

@RestController
public class AddressController {
	@Autowired
	private AddressService service;
	
	@GetMapping("/address")
	public List<Address> listALL(){
		System.out.println("Testing");
		return service.listAllAddress();
	}
	
//	@GetMapping("/address/{id}") //FAULTY!ERROR
//	public Optional<Address> getUserById(@PathVariable Integer id){
//		try {
//		Optional<Address> address=service.getAddressById(id);
//		System.out.println(address);
//		return address;//200
//		}catch(NoSuchElementException e) {
//			return null;//404
//		}
//	}
	
	@GetMapping("/address/{id}")
    public ResponseEntity<Optional<Address>> selectAddressById(@PathVariable Integer id){
        try {
            Optional<Address> foundAddress = service.getAddressById(id);
            return new ResponseEntity<>(foundAddress, HttpStatus.OK);
        } catch(NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
	}

	@PostMapping("/address")
	public void addAddress(@RequestBody Address address) {
		service.createAddress(address);
	}
	
	@DeleteMapping("/address/{id}")
	public void deleteAddress(@PathVariable Integer id) {
		service.deleteAddress(id);
	}
	
	//just added for the update method
	@PutMapping("/address/{id}")
	public void updateAddress(@RequestBody Address address, @PathVariable Integer id) {
		service.updateAddress(address, id);
	}
	
	
}
