package org.cap.demo.model;

public class Product {
	
	private int productId;
	private String productName;
	private String decription;
	private int quantity;
	private double rate_per_qty;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDecription() {
		return decription;
	}
	public void setDecription(String decription) {
		this.decription = decription;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getRate_per_qty() {
		return rate_per_qty;
	}
	public void setRate_per_qty(double rate_per_qty) {
		this.rate_per_qty = rate_per_qty;
	}
	public Product(int productId, String productName, String decription, int quantity, double rate_per_qty) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.decription = decription;
		this.quantity = quantity;
		this.rate_per_qty = rate_per_qty;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", decription=" + decription
				+ ", quantity=" + quantity + ", rate_per_qty=" + rate_per_qty + "]";
	}
	
	
	
}
