package com.kenzie.capstoneproject.model;

import java.util.*;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	private int userId;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNo;
	private String role = "customer";
	
//	@OneToOne
//	private int cartId;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user_id")
    private List<Address> addresses = new ArrayList<>();
	
	
//	@Column(name="userId")
//	private Integer id;
//	
//	@Column(name="userName")
//	private String userName;
//	
//	@Column(name="password")
//	private String password;
//	
//	@Column(name="firstName")
//	private String firstName;
//	
//	@Column(name="lastName")
//	private String lastName;
//	
//	@Column(name="email")
//	private String email;
//	
//	@Column(name="phoneNo")
//	private String phoneNo;
//	
//	@Column(name="role")
//	private String role = "customer";
//	
//	@Column(name="cartId")
//	private Integer cartId;
//	
//	@Column(name="createdAt")
//	private String createdAt; //TODO automate this
//	
//	@Column(name="updatedAt")
//	private String updatedAt; //TODO automate this
//	
//	@OneToMany(mappedBy = "user")
//	private List<Address>shippingAddressId; //creates address column but no connection to the address entered
//	
//	@OneToMany(mappedBy = "user")
//	private List<Address>billingAddressId; //creates address column but no connection to the address entered

}
