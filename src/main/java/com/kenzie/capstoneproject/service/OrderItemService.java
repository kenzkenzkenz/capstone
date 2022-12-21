package com.kenzie.capstoneproject.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kenzie.capstoneproject.repo.OrderItemRepository;
import com.kenzie.capstoneproject.model.OrderItem;

@Service
public class OrderItemService {
	@Autowired
	private OrderItemRepository repo;

	//READ all order items
	public List<OrderItem> listAllOrderItem() {
		return repo.findAll();

	}
	
	//POST order item
	public void createOrderItem(OrderItem orderItem) {
		  repo.save(orderItem);
	}
	
	//READ order item
	public Optional<OrderItem> getOrderItemById(Integer id) {
		return repo.findById(id);
	}
	
	//DELETE order item
	public void deleteOrderItem(Integer id) {
		repo.deleteById(id);
	}
	
	//PUT order item
	public void updateOrderItem(OrderItem orderItem, Integer id) {
		orderItem.setQuantity(orderItem.getQuantity());
		orderItem.setOrderItemId(id);
		repo.saveAndFlush(orderItem);
	}

}
