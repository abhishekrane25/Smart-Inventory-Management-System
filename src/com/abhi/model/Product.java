package com.abhi.model;

public class Product {
	
	// Data Fields & Members
	private int pid;
	private String productName;
	private double price;
	private int quantity;
	private int minStockLevel;
	private int supplierId;
	
	// Constructor Using Fields
	public Product(int pid, String productName, double price, int quantity, int minStockLevel, int supplierId) {
		super();
		this.pid = pid;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.minStockLevel = minStockLevel;
		this.supplierId = supplierId;
	}

	// Constructor
	public Product() {
		// TODO Auto-generated constructor stub
	}
	

	// Getters & Setters 
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getMinStockLevel() {
		return minStockLevel;
	}

	public void setMinStockLevel(int minStockLevel) {
		this.minStockLevel = minStockLevel;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	// toString method for output
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", productName=" + productName + ", price=" + price + ", quantity=" + quantity
				+ ", minStockLevel=" + minStockLevel + ", supplierId=" + supplierId + "]";
	}
	
	
}
