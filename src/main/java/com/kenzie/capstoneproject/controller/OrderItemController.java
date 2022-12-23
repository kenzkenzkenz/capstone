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

import com.kenzie.capstoneproject.model.OrderItem;
import com.kenzie.capstoneproject.service.OrderItemService;

@RestController
public class OrderItemController {
	@Autowired
	private OrderItemService service;	
	@GetMapping("/orderItem")
	public List<OrderItem> listALL(){
		System.out.println("Testing");
		return service.listAllOrderItem();
	}
	
	@GetMapping("/orderItem/{id}")
	public ResponseEntity<Optional<OrderItem>>selectOrderItemById(@PathVariable Integer id){
		try {
			Optional<OrderItem> foundOrderItem=service.getOrderItemById(id);
			return new ResponseEntity<>(foundOrderItem, HttpStatus.OK);
		} catch(NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/orderItem")
	public void addOrderItem(@RequestBody OrderItem orderItem) {
		service.createOrderItem(orderItem);
	}
	
	@DeleteMapping("/orderItem/{id}")
	public void deleteOrderItem(@PathVariable Integer id) {
		service.deleteOrderItem(id);
	}
	
	//just added for the update method
	@PutMapping("/orderItem/{id}")
	public void updateOrderItem(@RequestBody OrderItem orderItem, @PathVariable Integer id) {
		service.updateOrderItem(orderItem, id);
	}
	
	
}
