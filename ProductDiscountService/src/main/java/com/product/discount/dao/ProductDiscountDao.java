package com.product.discount.dao;

import org.hibernate.Session;

import com.product.discount.model.Discount;

public interface ProductDiscountDao {

	Session getSession();
	public Discount getDiscountForProduct(int productId );
}
