package com.kenzie.capstoneproject.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kenzie.capstoneproject.repo.ProductRepository;
import com.kenzie.capstoneproject.model.Product;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repo;

	//READ all product
	public List<Product> listAllProduct() {
		return repo.findAll();

	}
	
	//POST product
	public void createProduct(Product product) {
		  repo.save(product);
	}
	
	//READ product
	public Optional<Product> getProductById(Integer id) {
		return repo.findById(id);
	}
	
	//DELETE product
	public void deleteProduct(Integer id) {
		repo.deleteById(id);
	}
	
	//PUT product
	public void updateProduct(Product product, Integer id) {
		product.setProductId(id);
		product.setProductName(product.getProductName());
		product.setProductStock(product.getProductStock());
		product.setBlobs(product.getBlobs());
		product.setPricePerUnit(product.getPricePerUnit());
		product.setProductDesc(product.getProductDesc());

		repo.saveAndFlush(product);
	}

}
