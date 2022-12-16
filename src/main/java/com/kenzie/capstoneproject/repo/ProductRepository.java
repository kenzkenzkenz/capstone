package com.kenzie.capstoneproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kenzie.capstoneproject.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
