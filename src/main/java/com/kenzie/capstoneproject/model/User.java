package com.kenzie.capstoneproject.model;

import java.util.*;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="userId")
	private Integer userId;
	
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
	
//	//@JsonBackReference
//	//@JsonIgnore
//	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)//if have orphanRemoval=true, postman gives errors on Update
//	private List<Address> addresses;
	
	@JsonBackReference
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "addressId")
    private List<Address> addresses;
    

//	//@JsonBackReference
//	@OneToMany(mappedBy = "user")//if have orphanRemoval=true, postman gives errors on Update
//	private List<TotalOrder> totalOrders;
}
