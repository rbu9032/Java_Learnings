package com.rbu.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.rbu.dao.ProductRepository;
import com.rbu.dto.ProductRequestDto;
import com.rbu.dto.ProductResponseDto;
import com.rbu.model.Product;
import com.rbu.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	private final ProductRepository productRepository;
	
	
	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	
	@Override
	public ProductResponseDto save(ProductRequestDto productRequestDto) {
		Product product = new Product();
		product.setProductName(productRequestDto.getProductName());
		product.setPrice(productRequestDto.getPrice());
		product.setDiscount(productRequestDto.getDiscount());
		if(product.getStock()>=0) {
			product.setAvailable(true);	
		}
		product.setStock(productRequestDto.getStock());
		Product save = productRepository.save(product);
		ProductResponseDto productResponseDto = new ProductResponseDto();
		BeanUtils.copyProperties(save, productResponseDto);
		return productResponseDto;
	}
	

	@Override
	public List<ProductResponseDto> getAllProducts() {
		List<Product> products = productRepository.findAll();
		List<ProductResponseDto> productLists = buildProductResponseList(products);
		return productLists;
	}


	@Override
	public ProductResponseDto getProductById(long id) {
	   Product productById = productRepository.findById(id).get();
	   ProductResponseDto productResponseDto = new ProductResponseDto();
	   BeanUtils.copyProperties(productById, productResponseDto);
	  
		return productResponseDto;
	}


	@Override
	public List<ProductResponseDto> getProductByName(String productName) {
		List<Product> products = productRepository.findByProductNameContaining(productName);
		List<ProductResponseDto> productResponseList = buildProductResponseList(products);
		return productResponseList;
	}
	
	@Override
	public List<ProductResponseDto> saveAllProducts(List<ProductRequestDto> productRequestDtos) {
		List<Product> products = buildProductsList(productRequestDtos);
		List<Product> saveProducts = productRepository.saveAll(products);
		List<ProductResponseDto> productResponseList = buildProductResponseList(saveProducts);
		return productResponseList;
	}

	@Override
	public ProductResponseDto updateProductByRating(long id, double rating) {
		Optional<Product> optionalProduct = productRepository.findById(id);
		if(optionalProduct.isPresent()) {
			Product product = optionalProduct.get();
			product.setRatings(rating);
			Product savedProduct = productRepository.save(product);
			ProductResponseDto productResponseDto = new ProductResponseDto();
			BeanUtils.copyProperties(savedProduct, productResponseDto);
			return productResponseDto;
		}
		return new ProductResponseDto();
	}

	@Override
	public String deleteProduct(long id) {
		Optional<Product> optionalProduct = productRepository.findById(id);
		if(optionalProduct.isPresent()) {
			Product product = optionalProduct.get();
			productRepository.delete(product);
			return product.getProductName();
		}
		return null;
	}
	
	private List<Product> buildProductsList(List<ProductRequestDto> productRequestDtos) {
		List<Product> products = new ArrayList<>();
		for(ProductRequestDto productRequestDto: productRequestDtos) {
			Product product  = new Product();
			BeanUtils.copyProperties(productRequestDto, product);
			product.setAvailable(true);
			products.add(product);
		}
		return products;
	}
	
	private List<ProductResponseDto> buildProductResponseList(List<Product> products) {
		List<ProductResponseDto> productLists = new ArrayList<>();
		for(Product product: products) {
			ProductResponseDto productResponseDto = new ProductResponseDto();
			BeanUtils.copyProperties(product, productResponseDto);
			productLists.add(productResponseDto);
		}
		return productLists;
	}

}
