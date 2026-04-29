package com.abhi.service;

import java.util.ArrayList;

import com.abhi.model.Order;

public interface IOrderService {
	
	String addOrder(Order order);
	ArrayList <Order> viewOrders();
}
