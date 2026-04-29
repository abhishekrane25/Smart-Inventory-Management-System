package com.abhi.model;

import java.time.LocalDateTime;

public class Order {
	private int orderId;
	private int supplierId;
	private int productId;
	private LocalDateTime orderDate;
	public Order() {
		// TODO Auto-generated constructor stub
	}
	// Order Constructor using fields
	
	public Order(int orderId, int supplierId, int productId, LocalDateTime orderDate) {
		super();
		this.orderId = orderId;
		this.supplierId = supplierId;
		this.productId = productId;
		this.orderDate = orderDate;
	}
	
	// Getters and Setters for Order
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public LocalDateTime getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}
	
	// toString method Order
	
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", supplierId=" + supplierId + ", productId=" + productId + ", orderDate="
				+ orderDate + "]";
	}
	
}
