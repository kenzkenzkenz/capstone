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
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId")
	private User user; //foreign key to user
	
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "totalOrder", orphanRemoval = true)
    private List<OrderItem> orderItems;
	
//	@OneToOne
//	private Address billingAddress; //foreign key to address
//	
//	@OneToOne
//	private Address shippingAddress; //foreign key to address
	
}
