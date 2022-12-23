package com.kenzie.capstoneproject.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	@Column(name="productId")
	private Integer productId;
	
	@Column(name="productName")
	private String productName;
	
	@Column(name="productStock")
	private Integer productStock;
	
	@Column(name="blobs")
	private String blobs = "Cloud link goes here.";
	
	@Column(name="pricePerUnit")
	private Double pricePerUnit;
	
	@Column(name="productDesc")
	private String productDesc;
	
    @JsonIgnore
    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY, orphanRemoval=true)
    private List<OrderItem> orderItems;
	
	
}
