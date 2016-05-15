package com.product.discount.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.product.discount.dao.ProductDiscountDao;
import com.product.discount.model.Discount;

@Service("productDiscountService")
@Transactional
public class ProductDiscountServiceImpl implements ProductDiscountService{
	
	@Autowired
	private ProductDiscountDao dao;
	
	public Discount getDiscountForProduct(int productId ){
		return dao.getDiscountForProduct(productId);
		
	}

	
}
