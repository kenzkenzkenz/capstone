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
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private int userId;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone_no")
	private String phoneNo;
	
	@Column(name="role")
	private String role = "customer";
	
	@JsonIgnore
	@OneToOne(mappedBy="user")
	private Cart cart;

	
    @OneToMany(mappedBy="user")
    private List<Address> addresses;

	@JsonIgnore
    @OneToMany(mappedBy="user")
    private List<TotalOrder> totalOrders;
}
