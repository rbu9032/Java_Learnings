package com.rbu.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private long orderId;
	
	private String status;
	
	@OneToMany(mappedBy = "order", cascade=CascadeType.ALL)
	private List<OrderItem> orderItem;

	public Order(String status, List<OrderItem> orderItem) {
		super();
		this.status = status;
		this.orderItem = orderItem;
	}
 
}
