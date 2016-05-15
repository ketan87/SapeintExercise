package com.product.catalogue.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.product.catalogue.model.Product;
@Repository("productCatalogueDao")
public class ProductCatalogueDaoImpl implements ProductCatalogueDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	protected Session getSession(){
		return sessionFactory.openSession();
	}
	
	@Override
	public List<Product> findAllProducts(String category) {
		List<Product> productList = null;
		try {
			productList = getSession().createQuery("From Product where Category =:category ")
					.setString("category", category).list();
			System.out.println("product list retrieved successfully!!!");
		} catch (HibernateException ex) {
			ex.printStackTrace();
		} 
		return productList;
	}

}
