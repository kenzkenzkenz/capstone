package com.kenzie.capstoneproject.model;

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
	@Column(name="userId")
	private Integer userId;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="role")
	private String role = "customer";
    
    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")//orphanRemoval=true leads to error upon get by id
    private List<Address> addresses;
    
    @JsonIgnore
	@OneToMany(fetch=FetchType.LAZY, mappedBy = "user")
	private List<TotalOrder> totalOrders;
}
