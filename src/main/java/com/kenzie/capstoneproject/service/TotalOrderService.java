package com.kenzie.capstoneproject.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kenzie.capstoneproject.repo.TotalOrderRepository;
import com.kenzie.capstoneproject.model.TotalOrder;

@Service
public class TotalOrderService {
	@Autowired
	private TotalOrderRepository repo;

	//READ all product
	public List<TotalOrder> listAllTotalOrder() {
		return repo.findAll();

	}
	
	//POST product
	public void createTotalOrder(TotalOrder totalOrder) {
		  repo.save(totalOrder);
	}
	
	//READ product
	public Optional<TotalOrder> getTotalOrderById(Integer id) {
		return repo.findById(id);
	}
	
	//DELETE product
	public void deleteTotalOrder(Integer id) {
		repo.deleteById(id);
	}
	
	//PUT product
	public void updateTotalOrder(TotalOrder totalOrder, Integer id) {
		totalOrder.setOrderDate(totalOrder.getOrderDate());
		totalOrder.setTrackingId(totalOrder.getTrackingId());
		totalOrder.setTotalPrice(totalOrder.getTotalPrice());
		totalOrder.setOrderStatus(totalOrder.getOrderStatus());
		
		totalOrder.setOrderItems(totalOrder.getOrderItems());
		totalOrder.setUser(totalOrder.getUser());
		totalOrder.setTotalOrderId(id);
		repo.saveAndFlush(totalOrder);
	}

}
