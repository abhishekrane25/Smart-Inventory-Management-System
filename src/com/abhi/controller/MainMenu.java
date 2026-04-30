package com.abhi.controller;

import java.util.Scanner;

public class MainMenu {
	private Scanner input = new Scanner(System.in);
	
	public void start() {
		
		while (true) {
			
			System.out.println("1. Product List Menu");
			System.out.println("2. Order List Menu");
			
			System.out.println(" Please enter your choice (1-2): ");
			int choice = input.nextInt();
			
			switch(choice) {
			
			case 1:
			{
				ProductListMenu productMenu = new ProductListMenu();
				productMenu.showMenu();
				break;
			}
			
			case 2:
			{
				OrderListMenu orderMenu = new OrderListMenu();
				orderMenu.showMenu();
				break;
			}
			
			default:
			{
				System.out.println(" Please enter a valid choice (1-2) ");
			}
			
			}
		}
	}
}
