package com.rbu.restaurant.builder;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.rbu.restaurant.dto.AddressRequestDto;
import com.rbu.restaurant.dto.ItemRequestDto;
import com.rbu.restaurant.dto.RestaurantRequestDto;
import com.rbu.restaurant.model.Address;
import com.rbu.restaurant.model.Item;
import com.rbu.restaurant.model.Restaurant;

public class RestaurnatBuilder {
	
	public static Restaurant buildRestaurantFromRestaurantDto(RestaurantRequestDto restaurantRequestDto) {
		return Restaurant.builder()
		          .restaurantName(restaurantRequestDto.getRestaurantName())
		          .phoneNo(restaurantRequestDto.getPhoneNo())
		          .address(buildAdressFromAddressRequestDto(restaurantRequestDto.getAddressRequestDto()))
		          .items(buildItemsFromItemsDto(restaurantRequestDto.getItemRequestDto()))
		          .build();
	}

	private static Address buildAdressFromAddressRequestDto(AddressRequestDto addressRequestDto) {
		Address address = new Address();
		BeanUtils.copyProperties(addressRequestDto, address);
		return address;
	}
	
	private static List<Item> buildItemsFromItemsDto(List<ItemRequestDto> itemRequestDto){
		List<Item> items  = new ArrayList<>();
		for(ItemRequestDto itemRequestDtos: itemRequestDto) {
			Item item = new Item();
			BeanUtils.copyProperties(itemRequestDtos, item);
			items.add(item);
		}
		return items;
	}
}
