package com.rbu.restaurant.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long orderId;

	private long userId;

	private long restaurantId;

	private String status;

	private double orderPrice;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "order_id")
	private List<OrderItem> orderItems;

	public Order(long userId, long restaurantId, String status, double orderPrice, List<OrderItem> orderItems) {
		super();
		this.userId = userId;
		this.restaurantId = restaurantId;
		this.status = status;
		this.orderPrice = orderPrice;
		this.orderItems = orderItems;
	}

}
