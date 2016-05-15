package com.product.catalogue.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.product.catalogue.dao.ProductCatalogueDao;
import com.product.catalogue.model.Product;

@Service("productCatalogueService")
@Transactional
public class ProductCatalogueServiceImpl implements ProductCatalogueService{
	
	@Autowired
	private ProductCatalogueDao dao;
	
	public List<Product> findAllProducts(String productCategory){
		return dao.findAllProducts(productCategory);
		
	}

	
}
