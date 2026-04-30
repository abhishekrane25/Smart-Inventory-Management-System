package com.abhi.service;

import java.util.ArrayList;

import com.abhi.model.Order;

public class OrderServiceImplementation implements IOrderService{

	ArrayList <Order> orderList = new ArrayList <Order> ();
	
	@Override
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

	public ArrayList<Order> viewOrderbyId(int orderId) {
		for(Order o: orderList) {
			if(o.getOrderId() == orderId) {
				return orderList;
			}
			else {
				return null;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Order> viewOrderById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateOrderById(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteOrderById(Order order) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
