package com.rbu.restaurant.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderRequestDto {

	private long userId;

	private long restaurantId;

	private double orderPrice;

	private List<OrderItemRequestDto> orderItemRequestDto;

}
