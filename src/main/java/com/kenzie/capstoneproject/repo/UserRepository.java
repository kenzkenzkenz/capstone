package com.kenzie.capstoneproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kenzie.capstoneproject.model.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}
