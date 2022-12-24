package com.kenzie.capstoneproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kenzie.capstoneproject.model.Bundle;

public interface BundleRepository extends JpaRepository<Bundle,Integer> {

}
