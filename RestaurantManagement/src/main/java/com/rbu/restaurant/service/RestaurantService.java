package com.rbu.restaurant.service;

import org.springframework.http.ResponseEntity;

import com.rbu.restaurant.dto.OrderRequestDto;
import com.rbu.restaurant.dto.OrderResponseDto;
import com.rbu.restaurant.dto.RestaurantCreationResponse;
import com.rbu.restaurant.dto.RestaurantRequestDto;
import com.rbu.restaurant.dto.RestaurantResponseDto;

public interface RestaurantService {

	RestaurantCreationResponse addRestaurant(RestaurantRequestDto restaurantRequestDto);
	
	RestaurantResponseDto getRestaurantById(long restaurantId);

	ResponseEntity<OrderResponseDto> placeOrder(OrderRequestDto orderRequestDto);
}
