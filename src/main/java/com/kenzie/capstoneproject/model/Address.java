package com.kenzie.capstoneproject.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="address")
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int addressId;
	private String street;
	private String city;
	private String state;
	private String country;
	private String zip;
	private Boolean isShipping;
	private Boolean isBilling;
	private User userId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;
	
//	@Column(name="addressId")
//	private Integer addressId;
//
//	
//	@Column(name="street")
//	private String street;
//	
//	@Column(name="city")
//	private String city;
//	
//	@Column(name="state")
//	private String state;
//	
//	@Column(name="country")
//	private String country;
//	
//	@Column(name="zip")
//	private String zip;
//	
//	@Column(name="isShipping")
//	private Boolean isShipping;
//	
//	@Column(name="isBilling")
//	private Boolean isBilling;
	
}
