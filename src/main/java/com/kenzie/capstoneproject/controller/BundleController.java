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

import com.kenzie.capstoneproject.model.Bundle;
import com.kenzie.capstoneproject.service.BundleService;

@RestController
public class BundleController {
	@Autowired
	private BundleService service;
	
	@GetMapping("/bundle")
	public List<Bundle> listALL(){
		System.out.println("Testing");
		return service.listAllBundle();
	}
	
	@GetMapping("/bundle/{id}")
	public ResponseEntity<Optional<Bundle>>selectBundleById(@PathVariable Integer id){
		try {
			Optional<Bundle> foundBundle=service.getBundleById(id);
			return new ResponseEntity<>(foundBundle, HttpStatus.OK);
		} catch(NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/bundle")
	public void addBundle(@RequestBody Bundle bundle) {
		service.createBundle(bundle);
	}
	
	@DeleteMapping("/bundle/{id}")
	public void deleteBundle(@PathVariable Integer id) {
		service.deleteBundle(id);
	}
	
	//just added for the update method
	@PutMapping("/bundle/{id}")
	public void updateBundle(@RequestBody Bundle bundle, @PathVariable Integer id) {
		service.updateBundle(bundle, id);
	}
	
	
}
