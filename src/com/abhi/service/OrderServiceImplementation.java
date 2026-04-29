package com.abhi.service;

import java.util.ArrayList;

import com.abhi.model.Order;

public class OrderServiceImplementation implements IOrderService{

	ArrayList <Order> orderList = new ArrayList <Order> ();
	
	public String addOrder(Order order) {
		String message = "";
		try {
			orderList.add(order);
			message = "Order id: " +order.getOrderId() + "added to the system.";	
		}
		catch (Exception e) {
			message = e.getMessage();
		}
		return message;
	}

	@Override
	public ArrayList<Order> viewOrders() {
		return orderList;
	}
	
	
	
	
}
