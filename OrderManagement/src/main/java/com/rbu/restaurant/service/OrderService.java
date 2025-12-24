package com.rbu.restaurant.service;

import com.rbu.restaurant.dto.OrderRequestDto;
import com.rbu.restaurant.dto.OrderResponseDto;

public interface OrderService {
	
	OrderResponseDto placeOrder(OrderRequestDto orderRequestDto);
	
	OrderResponseDto updateOrderStatus(long orderId, String status);

	String getRestaurantNameById(long restaurantId);

}
