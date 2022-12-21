package com.kenzie.capstoneproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kenzie.capstoneproject.model.TotalOrder;

public interface TotalOrderRepository extends JpaRepository<TotalOrder,Integer> {

}
