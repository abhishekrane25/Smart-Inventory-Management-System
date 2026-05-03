package com.abhi.service;

import java.time.LocalDateTime;
import java.util.ArrayList;

import com.abhi.model.Order;

public interface IOrderService {
	
	String addOrder(Order order);
	ArrayList <Order> viewOrders();
	ArrayList <Order> viewOrderById();
	String updateOrderById(int orderId, int productId, int supplierId, LocalDateTime orderDate);
	String deleteOrderById(int orderId);
	
	
}
