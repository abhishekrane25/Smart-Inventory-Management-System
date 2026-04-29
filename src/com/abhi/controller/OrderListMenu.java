package com.abhi.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

import com.abhi.model.Order;
import com.abhi.service.OrderServiceImplementation;

public class OrderListMenu {
	public static void main(String[] args) {
	
		OrderServiceImplementation orderImpl = new OrderServiceImplementation();
		
		while(true) {
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			System.out.println("\n 1. Add Order\n 2. View Order by Id\n 3.View All Orders\n 4. Update Order by Id \n 5. Delete Order by Id \n Please enter your choice (1-5): ");
			int choice = input.nextInt();
			switch (choice) {
			
			case 1:
			{
				System.out.println(" ------------ Add Order ------------ \n");
				System.out.println("Enter Order ID:");
				int orderId = input.nextInt();
				System.out.println("Enter Supplier ID:");
				int supplierId = input.nextInt();
				System.out.println("Enter Product ID: ");
				int productId = input.nextInt();
				LocalDateTime orderDate = LocalDateTime.now();
				System.out.println("The Order date is: "+ orderDate);
				
				Order order = new Order(orderId, supplierId, productId, orderDate);
				String result_message = orderImpl.addOrder(order);
				
				System.out.println(result_message);
				
				break;
			}

			case 2:{
				System.out.println(" ------------ View All Orders  ------------ \n");
				ArrayList<Order> orderList = orderImpl.viewOrders();
				System.out.println(orderList);
				
				break;
			}

			case 3:
				System.out.println(" ------------ View Order by ID ------------ ");
			case 4:
				System.out.println(" ------------ Update Order by ID ------------ ");
				
			case 5:
				System.out.println(" ------------ Delete Order by ID ------------ ");
			default:
				System.out.println(" ------------ Exiting Program  ------------ ");
			
			
			}
		}
	}
}

