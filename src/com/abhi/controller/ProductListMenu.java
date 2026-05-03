package com.abhi.controller;

import java.util.List;
import java.util.Scanner;

import com.abhi.model.Product;
import com.abhi.service.ProductServiceImplementation;

public class ProductListMenu {
		
		private Scanner input = new Scanner(System.in);
		
		public void showMenu() {

			// Implementation Object for Product Class
			ProductServiceImplementation prodImpl = new ProductServiceImplementation();

			while(true) {
				
				System.out.println("1. Add Product");
				System.out.println("2. View Product By ID");
				System.out.println("3. View All Products");
				System.out.println("4. Update Product by ID");
				System.out.println("5. Delete Product by ID");
				System.out.println("6. Return To Main-Menu ");
				System.out.println(" Please enter your choice (1-5):");
				
				int choice = input.nextInt();
				
				switch (choice)
				{
				
				case 1:
				{
				
				System.out.println("--------------- Add Product --------------- \n");
				System.out.println("Enter Product ID:\n");
				int pid = input.nextInt();
				Boolean checkId = prodImpl.checkId(pid); // ID Existence Check -- Data validation 
				if(!checkId) {
					
					System.out.println("Enter Product Name:\n");
					String productName = input.next();
					
					System.out.println("Enter Product Price:\n");
					double price = input.nextDouble();
					
					System.out.println("Enter Product quantity:\n");
					int quantity = input.nextInt();
					
					System.out.println("Enter Product minimum stock level:\n");
					int minStockLevel = input.nextInt();
					
					System.out.println("Enter Product Supplier ID:\n");
					int supplierId = input.nextInt();
					
					
					Product prod = new Product(pid, productName, price, quantity, minStockLevel, supplierId);
					String result = prodImpl.addProduct(prod);
					System.out.println(result);
					break;
					
				}		
				else 
				{
					System.out.println("ID already exists. Please enter different ID.\n");
					break;
				}
				
				}
					
				case 2:
				{
				
				System.out.println("--------------- View Product By ID --------------- \n");
				
				System.out.println("Enter Product ID:\n");
				int pid = input.nextInt();
				
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
				int pid = input.nextInt();
				
				System.out.println("\n 1. Update Name\n 2.Update Price\n Enter your choice:\n");
				int updateChoice = input.nextInt();
				
				String updateProductName = "";
				double updateProductPrice = 0;
				
				
				switch(updateChoice) {		
				case 1:{
				
				System.out.println("Enter Product Name:\n");
				updateProductName = input.next();
				
				String result = prodImpl.updateProduct(pid, updateProductName, updateProductPrice);
				System.out.println(result);
				break;
				
				}
						
				case 2:{
				
				System.out.println("Enter Product Price:\n");
				updateProductPrice = input.nextDouble();
				updateProductName = null;
				
				String result = prodImpl.updateProduct(pid, updateProductName, updateProductPrice);
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
				int pid = input.nextInt();
				
				String result = prodImpl.deleteProduct(pid);
				System.out.println(result);
				break;
				
				}
				
				case 6:
				{
					
					System.out.println("Returning To Main-Menu...");
					return;
					
				}
				
				default:
				{
				
				System.out.println("Exiting program.\n");
				
				}
				
				}
			}
		}
}
