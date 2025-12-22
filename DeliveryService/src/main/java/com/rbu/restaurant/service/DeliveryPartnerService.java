package com.rbu.restaurant.service;

import org.springframework.http.ResponseEntity;

import com.rbu.restaurant.dto.DeliveryPartnerRequestDto;
import com.rbu.restaurant.dto.DeliveryPartnerResponseDto;
import com.rbu.restaurant.dto.OrderResponseDto;
import com.rbu.restaurant.dto.RestaurantCreationResponse;
import com.rbu.restaurant.dto.RestaurantRequestDto;

public interface DeliveryPartnerService {
	
	DeliveryPartnerResponseDto registerDeliveryPartner(DeliveryPartnerRequestDto deliveryRequestDto);

	ResponseEntity<OrderResponseDto> updateOrderStatus(long orderId, String status);
	
	ResponseEntity<String> getRestaurantNameById(long restaurantId);

	ResponseEntity<RestaurantCreationResponse> addRestaurant(RestaurantRequestDto restaurantRequestDto);
}
