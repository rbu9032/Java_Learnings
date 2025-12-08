package com.rbu.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.rbu.dto.OrderRequestDTO;
import com.rbu.dto.OrderResponseDTO;

public interface OrderService {
	
	public OrderResponseDTO placeOrder(List<OrderRequestDTO> orderRequestDTOs);

	public ResponseEntity<OrderResponseDTO> getOrderInfo(long orderId);

	public ResponseEntity<Void> cancelItem(long orderItemId);

}
