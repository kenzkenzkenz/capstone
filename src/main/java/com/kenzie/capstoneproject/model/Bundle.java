package com.kenzie.capstoneproject.model;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="bundle")
public class Bundle {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="bundleId")
	private Integer bundleId;
	
	@Column(name="quantity")
	private Integer quantity;
    
    @ManyToOne
    @JoinColumn(name ="productId", nullable=false)
    private Product product;
    
    @ManyToOne
	@JoinColumn(name = "totalOrderId", nullable=false)
	private TotalOrder totalOrder;
	
}
