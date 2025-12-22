package com.rbu.restaurant.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rbu.restaurant.dto.OrderRequestDto;
import com.rbu.restaurant.dto.OrderResponseDto;
import com.rbu.restaurant.dto.RestaurantCreationResponse;
import com.rbu.restaurant.dto.RestaurantRequestDto;
import com.rbu.restaurant.dto.RestaurantResponseDto;
import com.rbu.restaurant.service.RestaurantService;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {
	
	private final RestaurantService restaurantService;
	 
	public RestaurantController(RestaurantService restaurantService) {
		this.restaurantService = restaurantService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<RestaurantCreationResponse> addRestaurant(@RequestBody RestaurantRequestDto restaurantRequestDto) {
		 RestaurantCreationResponse restaurantCreationResponse = restaurantService.addRestaurant(restaurantRequestDto);
		 return ResponseEntity.status(HttpStatus.CREATED).body(restaurantCreationResponse);
	}
    @GetMapping("/{restaurantId}")
	public ResponseEntity<RestaurantResponseDto> getRestaurantById(@PathVariable(name = "restaurantId")long id){
    	RestaurantResponseDto restaurantResponseDto = restaurantService.getRestaurantById(id);
    	return ResponseEntity.ok(restaurantResponseDto);
	}
    
    @GetMapping("/name/{restaurantId}")
  	public ResponseEntity<String> getRestaurantNameById(@PathVariable(name = "restaurantId")long id){
      	RestaurantResponseDto restaurantResponseDto = restaurantService.getRestaurantById(id);
      	return ResponseEntity.ok(restaurantResponseDto.getRestaurantName());
  	}
    
//    Restaurant placing order(In RestaurantManagement we are calling OrderManagement to place order
    @PostMapping("/order")
    public ResponseEntity<OrderResponseDto> placeOrder(@RequestBody OrderRequestDto orderRequestDto){
    	return restaurantService.placeOrder(orderRequestDto);
    }
}
