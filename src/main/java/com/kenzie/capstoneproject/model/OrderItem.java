package com.kenzie.capstoneproject.model;

import java.util.*;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="orderItem")
public class OrderItem {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="order_item_id")
	private int orderItemId;
	
	@Column(name="quantity")
	private int quantity;
	
//	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumn(name = "orderItemId")
//	private TotalOrder totalOrder; //foreign key to totalOrder
//	
//	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumn(name = "orderItemId")
//	private Cart cart; //foreign key to totalOrder
	
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="product_id", nullable=false)
    private Product product; //foreign key to product
	
}
