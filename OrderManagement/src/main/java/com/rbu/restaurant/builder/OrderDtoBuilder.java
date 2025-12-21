package com.rbu.restaurant.builder;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.rbu.restaurant.dto.OrderItemResponseDto;
import com.rbu.restaurant.dto.OrderResponseDto;
import com.rbu.restaurant.model.Order;
import com.rbu.restaurant.model.OrderItem;



public class OrderDtoBuilder {
	
	public static OrderResponseDto buildOrderResponseDtoFromOrder(Order order) {
			
	return	OrderResponseDto.builder()
		           .orderId(order.getOrderId())
		           .status(order.getStatus())
		           .orderPrice(order.getOrderPrice())
		           .orderItems(buildOrderItemResponseDto(order.getOrderItems()))
		           .build();
	}
	
	private static List<OrderItemResponseDto> buildOrderItemResponseDto(List<OrderItem> orderItems){
		
		List<OrderItemResponseDto> orderItemResponseDtoList = new ArrayList<>();
		for(OrderItem orderItem: orderItems) {
			OrderItemResponseDto orderItemResponseDto = new OrderItemResponseDto();
			BeanUtils.copyProperties(orderItem, orderItemResponseDto);
			orderItemResponseDtoList.add(orderItemResponseDto);
		}
		return orderItemResponseDtoList;
	}

}
