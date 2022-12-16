package com.kenzie.capstoneproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Product")
public class Product {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="productId")
	private Integer productId;
	
	@Column(name="productQuantity")
	private Integer productQuantity;
	
	@Column(name="productName")
	private String productName;
	
	@Column(name="blobs")
	private String blobs = "I have no idea how to do BLOB";
	
	@Column(name="pricePerUnit")
	private Double pricePerUnit;
	
	@Column(name="productDesc")
	private String productDesc;
}
