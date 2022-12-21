package com.kenzie.capstoneproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kenzie.capstoneproject.model.Cart;

public interface CartRepository extends JpaRepository<Cart,Integer> {

}
