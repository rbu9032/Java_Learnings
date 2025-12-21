package com.rbu.restaurant.service.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.rbu.restaurant.builder.RestaurantDtoBuilder;
import com.rbu.restaurant.builder.RestaurnatBuilder;
import com.rbu.restaurant.dao.RestaurantRepository;
import com.rbu.restaurant.dto.OrderRequestDto;
import com.rbu.restaurant.dto.OrderResponseDto;
import com.rbu.restaurant.dto.RestaurantCreationResponse;
import com.rbu.restaurant.dto.RestaurantRequestDto;
import com.rbu.restaurant.dto.RestaurantResponseDto;
import com.rbu.restaurant.exception.RestaurantNotFoundException;
import com.rbu.restaurant.model.Restaurant;
import com.rbu.restaurant.service.RestaurantService;

@Service
public class RestaurantServiceImpl implements RestaurantService {

	private final RestaurantRepository restaurantRepository;
	
	private final RestTemplate restTemplate;

	public RestaurantServiceImpl(RestaurantRepository restaurantRepository, RestTemplate restTemplate) {
		super();
		this.restaurantRepository = restaurantRepository;
		this.restTemplate = restTemplate;
	}

	@Override
	public RestaurantCreationResponse addRestaurant(RestaurantRequestDto restaurantRequestDto) {
		Restaurant restaurant = RestaurnatBuilder.buildRestaurantFromRestaurantDto(restaurantRequestDto);
		Restaurant savedRestaurant = restaurantRepository.save(restaurant);
		return new RestaurantCreationResponse(savedRestaurant.getRestaurantId(), savedRestaurant.getRestaurantName());
	}

	@Override
	public RestaurantResponseDto getRestaurantById(long restaurantId) {
		Restaurant restaurant = restaurantRepository.findById(restaurantId).orElseThrow(() -> new RestaurantNotFoundException("No restaurant found with Id: " +restaurantId));
		return RestaurantDtoBuilder.buildRestaurantResponseDTOFromRestaurant(restaurant);
	}

	@Override
	public ResponseEntity<OrderResponseDto> placeOrder(OrderRequestDto orderRequestDto) {
		//return restTemplate.postForObject("http://localhost:8003/orders", orderRequestDto, OrderResponseDto.class);
		return restTemplate.postForEntity("http://localhost:8003/orders", orderRequestDto, OrderResponseDto.class);
	}

}
