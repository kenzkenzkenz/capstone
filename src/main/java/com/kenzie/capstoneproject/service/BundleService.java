package com.kenzie.capstoneproject.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kenzie.capstoneproject.repo.BundleRepository;
import com.kenzie.capstoneproject.model.Bundle;

@Service
public class BundleService {
	@Autowired
	private BundleRepository repo;

	//READ ALL BUNDLES
	public List<Bundle> listAllBundle() {
		return repo.findAll();
	}
	
	//POST BUNDLE
	public void createBundle(Bundle bundle) {
		  repo.save(bundle);
	}
	
	//READ BUNDLE BY ID
	public Optional<Bundle> getBundleById(Integer id) {
		return repo.findById(id);
	}
	
	//DELETE BUNDLE
	public void deleteBundle(Integer id) {
		repo.deleteById(id);
	}
	
	//UPDATE BUNDLE
	public void updateBundle(Bundle bundle, Integer id) {
		bundle.setBundleId(id);
		bundle.setQuantity(bundle.getQuantity());
		bundle.setProduct(bundle.getProduct());
		bundle.setTotalOrder(bundle.getTotalOrder());
		repo.saveAndFlush(bundle);
	}

}
