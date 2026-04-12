package com.abhi.model;

import java.time.LocalDateTime;

public class InventoryTransaction {

	// Data fields for InventoryTransaction
	
	private int transactionId;
	private int productId;
	private String type;
	private int quantity;
	private LocalDateTime timestamp;
	
	
	// InventoryTransaction constructor using data fields
	
	public InventoryTransaction(int transactionId, int productId, String type, int quantity, LocalDateTime timestamp) {
		super();
		this.transactionId = transactionId;
		this.productId = productId;
		this.type = type;
		this.quantity = quantity;
		this.timestamp = timestamp;
	}

	
	// Getters and Setters 
	
	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	
	// toString for output display
	
	@Override
	public String toString() {
		return "InventoryTransaction [transactionId=" + transactionId + ", productId=" + productId + ", type=" + type
				+ ", quantity=" + quantity + ", timestamp=" + timestamp + "]";
	}
	
	
}
