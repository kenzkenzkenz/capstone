package com.kenzie.capstoneproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kenzie.capstoneproject.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

}
