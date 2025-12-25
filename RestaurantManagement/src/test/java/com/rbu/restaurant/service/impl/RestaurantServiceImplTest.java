package com.rbu.restaurant.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.rbu.restaurant.dao.RestaurantRepository;
import com.rbu.restaurant.dto.AddressRequestDto;
import com.rbu.restaurant.dto.ItemRequestDto;
import com.rbu.restaurant.dto.RestaurantCreationResponse;
import com.rbu.restaurant.dto.RestaurantRequestDto;
import com.rbu.restaurant.dto.RestaurantResponseDto;
import com.rbu.restaurant.model.Address;
import com.rbu.restaurant.model.Item;
import com.rbu.restaurant.model.Restaurant;

@ExtendWith(MockitoExtension.class)
public class RestaurantServiceImplTest {
	
	@Mock
	RestaurantRepository restaurantRepository;
	
	@InjectMocks
	RestaurantServiceImpl restaurantServiceImpl;
	
	@BeforeEach
	public void setup() {
		//restaurantServiceImpl = new RestaurantServiceImpl(restaurantRepository, null);
		System.out.println("In setup");
	}
	
	@Test
	public void addRestaurantSuccess() {
		
		
		
		AddressRequestDto addressRequestDto = new AddressRequestDto();
		addressRequestDto.setCity("Proddatur");
		addressRequestDto.setPincode("516360");
		
		ItemRequestDto itemRequestDto = new ItemRequestDto();
		itemRequestDto.setItemCategory("Starters");
		itemRequestDto.setItemName("Chicken Maharaja");
		
		List<ItemRequestDto> items = new ArrayList<>();
		items.add(itemRequestDto);
		
		RestaurantRequestDto restaurantRequestDto = new RestaurantRequestDto();
		restaurantRequestDto.setAddressRequestDto(addressRequestDto);
		restaurantRequestDto.setItemRequestDto(items);
		restaurantRequestDto.setRestaurantName("Tindam ra");
		
		Restaurant rs= new Restaurant();
		rs.setRestaurantName("Tindam ra");
		
		when(restaurantRepository.save(any(Restaurant.class))).thenReturn(rs);
		
		RestaurantCreationResponse addRestaurant = restaurantServiceImpl.addRestaurant(restaurantRequestDto);
		
		assertNotNull(addRestaurant);
		assertEquals("Tindam ra", addRestaurant.getRestaurantName());
		
	}
	
	@Test
	//@Disabled
	public void testGetRestaurantByIdSuccess() {
		
		
		Address address = new Address();
		address.setAddressId(1L);
		address.setCity("Proddatur");
		
		Item item = new Item();
		item.setItemAvailable(true);
		item.setItemCategory("Starters");
		
		List<Item> items = new ArrayList<>();
		items.add(item);
		
		
		Restaurant rs= new Restaurant();
		rs.setRestaurantId(1L);
		rs.setRestaurantName("Tindam ra");
		rs.setAddress(address);
		rs.setItems(items);
		
		
		when(restaurantRepository.findById(1L)).thenReturn(Optional.of(rs));
		RestaurantResponseDto restaurantResponetDto = restaurantServiceImpl.getRestaurantById(1);
		assertNotNull(restaurantResponetDto);
		assertEquals(1L, restaurantResponetDto.getRestaurantId());
		assertEquals("Tindam ra", restaurantResponetDto.getRestaurantName());
	}

}
