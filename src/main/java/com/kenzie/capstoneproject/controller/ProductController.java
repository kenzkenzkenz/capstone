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
import com.kenzie.capstoneproject.model.Product;
import com.kenzie.capstoneproject.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService service;	
	@GetMapping("/product")
	public List<Product> listALL(){
		System.out.println("Testing");
		return service.listAllProduct();
	}
	
	@GetMapping("/product/{id}")
    public ResponseEntity<Optional<Product>> selectProductById(@PathVariable Integer id){
        try {
            Optional<Product> foundProduct = service.getProductById(id);
            return new ResponseEntity<>(foundProduct, HttpStatus.OK);
        } catch(NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
	}
	
	@PostMapping("/product")
	public void addProduct(@RequestBody Product product) {
		service.createProduct(product);
	}
	
	@DeleteMapping("/product/{id}")
	public void deleteProduct(@PathVariable Integer id) {
		service.deleteProduct(id);
	}
	
	//just added for the update method
	@PutMapping("/product/{id}")
	public void updateProduct(@RequestBody Product product, @PathVariable Integer id) {
		service.updateProduct(product, id);
	}
	
	
}
