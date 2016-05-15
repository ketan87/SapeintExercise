package com.product.catalogue.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="PRODUCT_INFO")
public class Product {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	
	@Size(min=3, max=100)
	@Column(name = "NAME", nullable = false)
	private String productName;
	
	@Size(min=3, max=50)
	@Column(name = "CATEGORY", nullable = false)
	private String productCategory;
	
	@Column(name = "PRICE", nullable = false)
	private double productPrice;
	
	@Size(min=3, max=200)
	@Column(name = "DESCRIPTION", nullable = false)
	private String productDescription;
	
	@Size(min=3, max=500)
	@Column(name = "REVIEW", nullable = false)
	private String productReview;
	
	@Column(name = "IMAGE")
	private byte[] productImage;

	public Product(int productId, String productName, String productCategory,
			double productPrice, String productDescription,
			String productReview, byte[] productImage) {
		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
		this.productDescription = productDescription;
		this.productReview = productReview;
		this.productImage = productImage;

	}
	
	public Product() {}

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

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductReview() {
		return productReview;
	}

	public void setProductReview(String productReview) {
		this.productReview = productReview;
	}

	public byte[] getProductImage() {
		return productImage;
	}

	public void setProductImage(byte[] productImage) {
		this.productImage = productImage;
	}

}