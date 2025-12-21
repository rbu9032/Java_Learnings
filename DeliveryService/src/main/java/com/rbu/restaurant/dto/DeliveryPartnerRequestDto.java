package com.rbu.restaurant.dto;

import java.util.List;

import com.rbu.restaurant.model.DeliveryAssignment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryPartnerRequestDto {
	
	private String deliveryPartnerName;

	private String aadharNo;

	private String phoneNo;

	private String email;

	private boolean isAvailable;

	private List<DeliveryAssignment> deliveryAssignments;

}
