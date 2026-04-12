package com.abhi.model;

public class Supplier {
	
	// Data fields for Supplier Entity Model
	
	private int supplierId;
	private String name;
	private String contact;
	private int rating;
	
	// Supplier Constructor using data fields 
	
	public Supplier(int supplierId, String name, String contact, int rating) {
		super();
		this.supplierId = supplierId;
		this.name = name;
		this.contact = contact;
		this.rating = rating;
	}

	// Supplier Constructor
	public Supplier() {}
	
	// Getters and Setters for Supplier

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	
	
	// toString for output display
	
	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", name=" + name + ", contact=" + contact + ", rating=" + rating
				+ "]";
	}
	
	
}
