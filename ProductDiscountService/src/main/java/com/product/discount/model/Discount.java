package com.product.discount.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="DISCOUNT_INFO")
public class Discount {
	
	@Id
	@Column(name = "ID")
	private int productId;
	
	@Column(name = "DISCOUNT")
	private int productDiscount;
	
	@Column(name = "DISCOUNT_PRICE")
	private long productDiscountPrice;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getProductDiscount() {
		return productDiscount;
	}

	public void setProductDiscount(int productDiscount) {
		this.productDiscount = productDiscount;
	}

	public long getProductDiscountPrice() {
		return productDiscountPrice;
	}

	public void setProductDiscountPrice(long productDiscountPrice) {
		this.productDiscountPrice = productDiscountPrice;
	}
	
	
}