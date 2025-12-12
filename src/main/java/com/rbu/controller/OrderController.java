package com.rbu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rbu.dto.OrderRequestDTO;
import com.rbu.dto.OrderResponseDTO;
import com.rbu.service.OrderService;

import io.micrometer.core.annotation.Counted;
import io.micrometer.core.annotation.Timed;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping("/buy")
	@Timed(value="orders.placed.time")
	@Counted(value="orders.placed.count")
	public OrderResponseDTO placeOrder(@RequestBody List<OrderRequestDTO> orderRequestDTO) {
		return orderService.placeOrder(orderRequestDTO);
	}

	@DeleteMapping("/cancel")
	public ResponseEntity<Void> cancelItem(@RequestParam(name="orderItemId")long orderItemId) {
		return orderService.cancelItem(orderItemId);
	}
	@GetMapping("/{orderId}")
	@Timed(value="orders.get.time")
	@Counted(value="orders.get.count")
	public ResponseEntity<OrderResponseDTO> getOrderInfo(@PathVariable(name="orderId") long orderId) {
		return orderService.getOrderInfo(orderId);
	}
}
