package com.kenzie.capstoneproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kenzie.capstoneproject.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Integer> {

}
