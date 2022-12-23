package com.kenzie.capstoneproject.model;

import java.util.*;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="totalOrder")
public class TotalOrder {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="totalOrderId")
	private Integer totalOrderId;
	
	@Column(name="orderDate")
	private java.sql.Date orderDate;
	
	@Column(name="trackingId")
	private String trackingId;
	
	@Column(name="totalPrice")
	private Double totalPrice;
	
	@Column(name="orderStatus")
	private String orderStatus;
	
	@JsonIgnore
    @OneToMany(mappedBy="totalOrder", fetch = FetchType.LAZY)//orphanRemoval=true leads to error
    private List<OrderItem> orderItems;
    
	@ManyToOne
	@JoinColumn(name = "userId", nullable=false)
	private User user;
	
//	@OneToOne
//	private Address billingAddress; //foreign key to address
//	
//	@OneToOne
//	private Address shippingAddress; //foreign key to address
	
}
