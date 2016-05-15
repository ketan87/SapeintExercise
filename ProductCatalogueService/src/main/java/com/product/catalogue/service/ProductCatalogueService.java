package com.product.catalogue.service;

import java.util.List;

import com.product.catalogue.model.Product;

public interface ProductCatalogueService {


	List<Product> findAllProducts(String productCategory); 
	
	
}


