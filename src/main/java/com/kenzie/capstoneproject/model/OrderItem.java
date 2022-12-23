package com.kenzie.capstoneproject.model;

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
	
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="productId", nullable=false)
    private Product product;
	
	@ManyToOne
	@JoinColumn(name = "totalOrderId", nullable=false)
	private TotalOrder totalOrder;
	
}
