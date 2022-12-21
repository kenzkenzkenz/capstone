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
	@Column(name="total_order_id")
	private int totalOrderId;
	
	@Column(name="order_date")
	private java.sql.Date orderDate;
	
	@Column(name="tracking_id")
	private String trackingId;
	
	@Column(name="total_price")
	private Double totalPrice;
	
	@Column(name="order_status")
	private String orderStatus;
	
	@ManyToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(name = "user_id", nullable = false)
	private User user; //foreign key to user
	
//	@JsonIgnore
//    @OneToMany(mappedBy="totalOrder", fetch = FetchType.LAZY, orphanRemoval = true)
//    private List<OrderItem> orderItems;
	
	@OneToOne
	private Address billingAddress; //foreign key to address
	
	@OneToOne
	private Address shippingAddress; //foreign key to address
	
}
