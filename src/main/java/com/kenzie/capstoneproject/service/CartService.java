package com.kenzie.capstoneproject.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kenzie.capstoneproject.repo.CartRepository;
import com.kenzie.capstoneproject.model.Cart;

@Service
public class CartService {
	@Autowired
	private CartRepository repo;

	//READ all cart
	public List<Cart> listAllCart() {
		return repo.findAll();

	}
	
	//POST cart
	public void createCart(Cart cart) {
		  repo.save(cart);
	}
	
	//READ cart
	public Optional<Cart> getCartById(Integer id) {
		return repo.findById(id);
	}
	
	//DELETE cart
	public void deleteCart(Integer id) {
		repo.deleteById(id);
	}
	
	//PUT cart
	public void updateCart(Cart cart, Integer id) {
		cart.setCartId(id);
		cart.setOrderItems(cart.getOrderItems());
		repo.saveAndFlush(cart);
	}

}
