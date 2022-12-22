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
	@Column(name="orderItemId")
	private Integer orderItemId;
	
	@Column(name="quantity")
	private Integer quantity;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cartId")
	private Cart cart;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "totalOrderId")
	private TotalOrder totalOrder;
	
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="productId")
    private Product product; //foreign key to product
	
}
