package com.abhi.model;

import java.time.LocalDateTime;

public class StockAlert {

	private int productId;
	private String message;
	private LocalDateTime generatedAt;
	
	// StockAlert Constructor using fields
	
	public StockAlert(int productId, String message, LocalDateTime generatedAt) {
		super();
		this.productId = productId;
		this.message = message;
		this.generatedAt = generatedAt;
	}
	
	// Getters and Setters for StockAlert fields
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LocalDateTime getGeneratedAt() {
		return generatedAt;
	}
	public void setGeneratedAt(LocalDateTime generatedAt) {
		this.generatedAt = generatedAt;
	}
	
	// ToString method for output display
	
	@Override
	public String toString() {
		return "StockAlert [productId=" + productId + ", message=" + message + ", generatedAt=" + generatedAt + "]";
	}
	
}
