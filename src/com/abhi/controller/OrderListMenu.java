package com.abhi.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import com.abhi.model.Order;
import com.abhi.service.OrderServiceImplementation;

public class OrderListMenu {
	
	private Scanner input = new Scanner(System.in);


	public void showMenu() {

			
			// Implementation Object for Order Class
			OrderServiceImplementation orderImpl = new OrderServiceImplementation();
			while(true) {

				// Order Menu 
				System.out.println("1. Add Order");
				System.out.println("2. View All Orders");
				System.out.println("3. View Order by Id");
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
					System.out.println("Enter order ID: ");
					int orderId = input.nextInt();
					System.out.println("\n");
					System.out.println("1. Update Supplier ID associated with Order");
					System.out.println("2. Update Product ID associated with Order");
					System.out.println("3. Update Order Date associated with Order");
					System.out.println("4. Return to previous menu.");
					int updateChoice = input.nextInt();
					switch (updateChoice) {
						case 1:{
						
							System.out.println("Enter new Supplier ID: ");
							int supplierId = input.nextInt();
							
							int productId = 0;
							LocalDateTime orderDate = null;
							String result = orderImpl.updateOrderById(orderId, supplierId, productId, orderDate);
							System.out.println(result);
							break;
						
						}
						case 2:
						{
							
							System.out.println("Enter new Product ID: ");
							int productId = input.nextInt();
							
							int supplierId = 0;
							LocalDateTime orderDate = null;
							
							String result = orderImpl.updateOrderById(orderId, productId, supplierId, orderDate);
							System.out.println(result);
							break;
							
						}
						case 3:
						{
							
							System.out.println("Please enter following details to update Order Date and Time");
							
							System.out.println("Enter Year (YYYY): ");
							String year = input.next();
							
							System.out.println("Enter Month (MM): ");
							String day = input.next();
							
							System.out.println("Enter Day (DD): ");
							String month = input.next();
							
							System.out.println("Enter Hour (HH): ");
							String hour = input.next();
							
							System.out.println("Enter Minutes (MM): ");
							String minutes = input.next();
							
							String date = (year+"-"+month+"-"+day+" "+hour+":"+minutes);
							System.out.println("Your updated order date is: "+ date);
							
							DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
							LocalDateTime orderDate = LocalDateTime.parse(date, formatter);
							
							int supplierId = 0;
							int productId = 0;
							
							
							String result = orderImpl.updateOrderById(orderId, productId, supplierId, orderDate);
							System.out.println(result);
							break;
							
						}
						case 4:
						{
							return;
						}
						default:
						{
							System.out.println("Please enter a valid choice (1-4)");
						}
					}
					
					break;
					
				}
				
				case 5:
				{
					
					System.out.println(" ------------ Delete Order by ID ------------ ");
					System.out.println(" Enter Order ID: ");
					int orderId = input.nextInt();
					String result = orderImpl.deleteOrderById(orderId);
					System.out.println(result);
					break;
					
				}
				
				case 6:
				{
					
					System.out.println("\n");
					return;
				}
				
				default:
				{	
					
					System.out.println(" Please enter valid choice (1-5)");	
				
				}
			}
			
				
		
			}
		
		}
	
		
	}
