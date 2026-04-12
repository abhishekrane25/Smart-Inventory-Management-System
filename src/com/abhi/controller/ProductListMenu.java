package com.abhi.controller;

import java.util.List;
import java.util.Scanner;

import com.abhi.model.Product;
import com.abhi.service.ProductServiceImplementation;

public class ProductListMenu {
	public static void main(String[] args) {
		
		ProductServiceImplementation prodImpl = new ProductServiceImplementation();
		
		while(true) {
			@SuppressWarnings("resource") // Suppressing Warning for scanner class object
			Scanner sc = new Scanner(System.in);
			System.out.println(" 1. Add Product\n 2. View Product By Id\n 3. View All Products\n 4. Update Product by ID \n 5. Delete Product by ID \n Please enter your choice (1-5):\n");
			int choice = sc.nextInt();
			
			switch (choice)
			{
			
				case 1:
				{
					System.out.println("--------------- Add Product --------------- \n");
					System.out.println("Enter Product ID:\n");
					int pid = sc.nextInt();
					Boolean checkId = prodImpl.checkId(pid); // ID Existence Check -- Data validation 
					if(!checkId) {
					System.out.println("Enter Product Name:\n");
					String productName = sc.next();
					System.out.println("Enter Product Price:\n");
					double price = sc.nextDouble();
					System.out.println("Enter Product quantity:\n");
					int quantity = sc.nextInt();
					System.out.println("Enter Product minimum stock level:\n");
					int minStockLevel = sc.nextInt();
					System.out.println("Enter Product Supplier ID:\n");
					int supplierId = sc.nextInt();
					
					Product prod = new Product(pid, productName, price, quantity, minStockLevel, supplierId);
					String result = prodImpl.addProduct(prod);
					System.out.println(result);
					break;
					}
					
					else {
						System.out.println("ID already exists. Please enter different ID.\n");
						break;
					}
				}
				
				case 2:
				{
					System.out.println("--------------- View Product By ID --------------- \n");
					System.out.println("Enter Product ID:\n");
					int pid = sc.nextInt();
					Product result = prodImpl.getProductById(pid);
					System.out.println(result);
					break;
				}
				
				case 3:
				{
					System.out.println("--------------- View All Products ---------------\n");
					List<Product> result = prodImpl.viewAllProducts();
					System.out.println(result);
					break;
				}
				
				case 4:
				{
					System.out.println("--------------- Update Product --------------- \n");
					System.out.println("Enter Product ID:");
					int pid = sc.nextInt();
					System.out.println("\n 1. Update Name\n 2.Update Price\n Enter your choice:\n");
					int updatedChoice = sc.nextInt();
					String updatedProductName = "";
					double updatedProductPrice = 0;
					switch(updatedChoice) {
					
						case 1:{
							System.out.println("Enter Product Name:\n");
							updatedProductName = sc.next();
							String result = prodImpl.updateProduct(pid, updatedProductName, updatedProductPrice);
							System.out.println(result);
							break;
						}
					
						case 2:{
							System.out.println("Enter Product Price:\n");
							updatedProductPrice = sc.nextDouble();
							updatedProductName = null;
							String result = prodImpl.updateProduct(pid, updatedProductName, updatedProductPrice);
							System.out.println(result);
							break;
						}
						
						default: {
							System.out.println("Invalid Input for Update Product. Please enter valid choice (1-2).\n");
						}
					
					}
					break;
				}

				case 5:
				{
					System.out.println("--------------- Delete Product --------------- \n");
					System.out.println("Enter Product ID:\n");
					int pid = sc.nextInt();
					//System.out.println("");
					String result = prodImpl.deleteProduct(pid);
					System.out.println(result);
					break;
				}
				
				default:{
					System.out.println("Exiting program.\n");
				}
			}
		}
	}
}
