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
@Table(name="user")
public class User {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="userId")
	private Integer id;
	
	@Column(name="userName")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phoneNo")
	private String phoneNo;
	
	@Column(name="role")
	private String role = "customer";
	
	@Column(name="cartId")
	private Integer cartId;
	
	@Column(name="shippingAddressId")
	private Integer shippingAddressId;
	
	@Column(name="billingAddressId")
	private Integer billingAddressId;
	
	@Column(name="createdAt")
	private String createdAt; //TODO automate this
	
	@Column(name="updatedAt")
	private String updatedAt; //TODO automate this

}
