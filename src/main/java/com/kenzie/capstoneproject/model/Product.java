package com.kenzie.capstoneproject.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="product_id")
	private int productId;
	
	@Column(name="product_quantity")
	private int productQuantity;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="blobs")
	private String blobs = "Cloud link goes here.";
	
	@Column(name="price_per_unit")
	private Double pricePerUnit;
	
	@Column(name="product_desc")
	private String productDesc;
	
//	@JsonIgnore
//    @OneToMany(mappedBy="totalOrder", fetch = FetchType.LAZY, orphanRemoval = true)
//    private List<OrderItem> orderItems;
	
}
