package com.product.discount.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.product.discount.model.Discount;
@Repository("productCatalogueDao")
public class ProductDiscountDaoImpl implements ProductDiscountDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession(){
		return sessionFactory.openSession();
	}
	
	public Discount getDiscountForProduct(int productId) {
		Discount discount = null;
		try {
			discount = (Discount) getSession().get(Discount.class, productId);
		} catch (HibernateException ex) {
			ex.printStackTrace();
		} 
		return discount;
	}

}
