package com.rbu.restaurant.dto;

import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryAssignmentRequestDto {

	private long orderId;

	private String status;

	private LocalTime assignedTime;

}
