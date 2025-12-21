package com.rbu.restaurant.model;

import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "delivery_assignments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryAssignment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long deliveryAssignementId;

	private long orderId;

	private String status;

	private LocalTime assignedTime;

	public DeliveryAssignment(long orderId, String status, LocalTime assignedTime) {
		super();
		this.orderId = orderId;
		this.status = status;
		this.assignedTime = assignedTime;
	}

}
