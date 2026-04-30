package com.abhi.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

import com.abhi.model.Order;
import com.abhi.service.OrderServiceImplementation;

public class OrderListMenu {
	
	private Scanner input = new Scanner(System.in);
	private Order order = new Order();

	public void showMenu() {
			
			// Implementation Object for Order Class
			OrderServiceImplementation orderImpl = new OrderServiceImplementation();

			while(true) {

				// Order Menu 
				System.out.println("1. Add Order");
				System.out.println("2. View Order by Id");
				System.out.println("3. View All Orders");
				System.out.println("4. Update Order by Id");
				System.out.println("5. Delete Order by Id");
				System.out.println(" Please enter your choice (1-5): ");
				
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
					new Order(orderId, supplierId, productId, orderDate);
					
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
				{
					/*
					 * Feat: add 'range' of ID to display.
					 * -> Adding range of IDs of orders for users to select from.
					 */
					System.out.println(" ------------ View Order by ID ------------ ");
					System.out.println("Enter order ID: ");
					int orderId = input.nextInt();
					ArrayList<Order> orderList = orderImpl.viewOrderbyId(orderId);
					
					System.out.println("----- Order No. "+ orderId +" -----");
					System.out.println(orderList);
					break;
				}
				
				case 4:
				{
					System.out.println(" ------------ Update Order by ID ------------ ");	
				}
				
				case 5:
				{
					System.out.println(" ------------ Delete Order by ID ------------ ");
				}
				
				default:
				{	
					System.out.println(" Please enter valid choice (1-5)");	
				}
			}
		}
		}
}
		

