package com.kenzie.capstoneproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kenzie.capstoneproject.model.Address;

public interface AddressRepository extends JpaRepository<Address,Integer> {

}
