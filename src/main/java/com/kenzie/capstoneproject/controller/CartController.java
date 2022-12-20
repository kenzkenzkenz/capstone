//package com.kenzie.capstoneproject.controller;
//
//import java.util.List;
//import java.util.NoSuchElementException;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.kenzie.capstoneproject.model.Cart;
//import com.kenzie.capstoneproject.service.CartService;
//
//@RestController
//public class CartController {
//	@Autowired
//	private CartService service;	
//	@GetMapping("/cart")
//	public List<Cart> listALL(){
//		System.out.println("Testing");
//		return service.listAllCart();
//	}	
//	@GetMapping("/cart/{id}")
//	public Optional<Cart> getCartById(@PathVariable Integer id){
//		try {
//		Optional<Cart> cart=service.getCartById(id);
//		System.out.println(cart);
//		return cart;//200
//		}catch(NoSuchElementException e) {
//			return null;//404
//		}
//	}
//	@PostMapping("/cart/create")
//	public void addCart(@RequestBody Cart cart) {
//		service.createCart(cart);
//	}
//	
//	@DeleteMapping("/cart/delete/{id}")
//	public void deleteCart(@PathVariable Integer id) {
//		service.deleteCart(id);
//	}
//	
//	//just added for the update method
//	@PutMapping("/cart/update/{id}")
//	public void updateCart(@RequestBody Cart cart, @PathVariable Integer id) {
//		service.updateCart(cart, id);
//	}
//	
//	
//}
