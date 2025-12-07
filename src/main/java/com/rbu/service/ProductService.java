package com.rbu.service;

import java.util.List;

import com.rbu.dto.ProductRequestDto;
import com.rbu.dto.ProductResponseDto;

public interface ProductService {

	public ProductResponseDto save(ProductRequestDto itemRequestDto);
	
	public List<ProductResponseDto> getAllProducts();
	
	public ProductResponseDto getProductById(long id);
	
	public List<ProductResponseDto> getProductByName(String productName);
	
	public List<ProductResponseDto> saveAllProducts(List<ProductRequestDto> productRequestDtos);

	public ProductResponseDto updateProductByRating(long id, double rating);

	public String deleteProduct(long id);
	
}
