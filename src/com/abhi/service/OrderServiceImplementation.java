package com.abhi.service;

import java.time.LocalDateTime;
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
	public String updateOrderById(int orderId, int productId, int supplierId, LocalDateTime orderDate) {
		
		try {

			for(Order o: orderList) {
				if(o.getOrderId() == orderId) {
					
					if(productId>0) {
						o.setProductId(productId);
					}
					else if(supplierId>0) {
						o.setSupplierId(supplierId);
					}
					else if(orderDate != null) {
						o.setOrderDate(orderDate);
					}
										
					return "Order ID: "+orderId + " updated successfully";

				}
				else {

					return "Order ID: "+orderId + " not found, please enter correct Order ID";
					
				}
			}
			
			return null;
			
		}
		catch(Exception e) {
			return "Error: "+e.getMessage();
		}
		
	}

	@Override
	public String deleteOrderById(int orderId) {
		
		try {
			for(Order o: orderList) {
				if(o.getOrderId() == orderId) {
					orderList.remove(o);
					return "Order ID: "+ orderId + " deleted successfully";
				}
			}
			
			return "Order ID: "+ orderId + " not found, please enter valid ID";
			
		}
		
		catch(Exception e) {
			return "Error: "+ e;
		}
	}

	
	
	
	
	
}
