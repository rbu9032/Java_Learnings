package com.rbu.restaurant.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryPartnerResponseDto {

	private String deliveryPartnerName;

	private String phoneNo;

	private boolean isAvailable;

}
