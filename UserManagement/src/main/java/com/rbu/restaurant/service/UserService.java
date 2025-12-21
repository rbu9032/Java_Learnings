package com.rbu.restaurant.service;

import com.rbu.restaurant.dto.UserRequestDto;
import com.rbu.restaurant.dto.UserResponseDto;

public interface UserService {

	UserResponseDto addUser(UserRequestDto userRequestDto);

}
