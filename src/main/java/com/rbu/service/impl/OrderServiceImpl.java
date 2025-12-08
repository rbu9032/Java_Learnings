package com.rbu.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rbu.dao.OrderItemRepository;
import com.rbu.dao.OrderRepository;
import com.rbu.dao.ProductRepository;
import com.rbu.dto.OrderItemResponseDTO;
import com.rbu.dto.OrderRequestDTO;
import com.rbu.dto.OrderResponseDTO;
import com.rbu.exception.OrderItemNotFoundException;
import com.rbu.exception.OrderNotFoundException;
import com.rbu.model.Order;
import com.rbu.model.OrderItem;
import com.rbu.model.Product;
import com.rbu.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	OrderItemRepository orderItemRepository;
	
	@Override
	public OrderResponseDTO placeOrder(List<OrderRequestDTO> orderRequestDTOs) {
		Order order = new Order();
		List<OrderItem> orderItemList = new ArrayList<>();
		order.setStatus("Ordered");
		
		for(OrderRequestDTO orderRequestDTO: orderRequestDTOs) {
			OrderItem orderItem = new OrderItem();
			Product product = productRepository.findById(orderRequestDTO.getProductId()).get();
			if(product.getStock()>=orderRequestDTO.getQuantity()) {
				orderItem.setQuantity(orderRequestDTO.getQuantity());
				orderItem.setProduct(product);
				orderItem.setOrder(order);
				orderItemList.add(orderItem);
				productRepository.updateStock(product.getProductId(), product.getStock()-orderRequestDTO.getQuantity());
			}
		}
		order.setOrderItem(orderItemList);
		
		Order savedOrder = orderRepository.save(order);
		
		return buildOrderResponseDtoFromOrder(order);
	}


	@Override
	public ResponseEntity<OrderResponseDTO> getOrderInfo(long orderId) {
	Order order = orderRepository.findById(orderId).orElseThrow(()-> new OrderNotFoundException("No Order Found with Id:"+ orderId));
	OrderResponseDTO  orderResponseDto = buildOrderResponseDtoFromOrder(order);
	return ResponseEntity.status(HttpStatus.OK).body(orderResponseDto);
	
	}

	@Override
	public ResponseEntity<Void> cancelItem(long orderItemId) {
		OrderItem orderItem  = orderItemRepository.findById(orderItemId).orElseThrow(()-> new OrderItemNotFoundException("No Order Item found for Id: "+ orderItemId));
		orderItemRepository.delete(orderItem);
		
		long productId = orderItem.getProduct().getProductId();
		int stock = orderItem.getProduct().getStock();
		productRepository.updateStock(productId, stock+orderItem.getQuantity());
		//return ResponseEntity.noContent().build();
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
	
	private OrderResponseDTO buildOrderResponseDtoFromOrder(Order savedOrder) {
		OrderResponseDTO orderResponseDTO = new OrderResponseDTO();
		orderResponseDTO.setOrderId(savedOrder.getOrderId());
		orderResponseDTO.setStatus(savedOrder.getStatus());
		
		List<OrderItemResponseDTO> orderItemResponseDTOList = new ArrayList<>();
		double totalOrderAmount = 0;
		for(OrderItem orderItem: savedOrder.getOrderItem()) {
			OrderItemResponseDTO orderItemResponseDTO = new OrderItemResponseDTO();
			orderItemResponseDTO.setProductId(orderItem.getProduct().getProductId());
			orderItemResponseDTO.setProductName(orderItem.getProduct().getProductName());
			orderItemResponseDTO.setQuantity(orderItem.getQuantity());
			orderItemResponseDTO.setOrderItemId(orderItem.getOrderItemId());
			double eachProductPrice = orderItem.getProduct().getPrice() * ((100-orderItem.getProduct().getDiscount())/100);
			orderItemResponseDTO.setEachProductPrice(eachProductPrice);
			double totalProductPrice = eachProductPrice * orderItem.getQuantity();
			orderItemResponseDTO.setTotalProductPrice(totalProductPrice);
			totalOrderAmount += totalProductPrice;
			orderItemResponseDTOList.add(orderItemResponseDTO);
		}
		orderResponseDTO.setTotalAmount(totalOrderAmount);
		orderResponseDTO.setOrderItemResponseDTO(orderItemResponseDTOList);
		return orderResponseDTO;
	}

}
