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
import com.kenzie.capstoneproject.model.TotalOrder;
import com.kenzie.capstoneproject.service.TotalOrderService;

@RestController
public class TotalOrderController {
	@Autowired
	private TotalOrderService service;	
	@GetMapping("/totalOrder")
	public List<TotalOrder> listALL(){
		System.out.println("Testing");
		return service.listAllTotalOrder();
	}	
	@GetMapping("/totalOrder/{id}")
    public ResponseEntity<Optional<TotalOrder>> selectTotalOrderById(@PathVariable Integer id){
        try {
            Optional<TotalOrder> foundTotalOrder = service.getTotalOrderById(id);
            return new ResponseEntity<>(foundTotalOrder, HttpStatus.OK);
        } catch(NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
	}
	@PostMapping("/totalOrder")
	public void addTotalOrder(@RequestBody TotalOrder totalOrder) {
		service.createTotalOrder(totalOrder);
	}
	
	@DeleteMapping("/totalOrder/{id}")
	public void deleteTotalOrder(@PathVariable Integer id) {
		service.deleteTotalOrder(id);
	}
	
	//just added for the update method
	@PutMapping("/totalOrder/{id}")
	public void updateTotalOrder(@RequestBody TotalOrder totalOrder, @PathVariable Integer id) {
		service.updateTotalOrder(totalOrder, id);
	}
	
	
}
