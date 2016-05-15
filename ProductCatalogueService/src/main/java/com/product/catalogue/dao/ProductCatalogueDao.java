package com.product.catalogue.dao;

import java.util.List;

import com.product.catalogue.model.Product;

public interface ProductCatalogueDao {

	List<Product> findAllProducts(String category);
}
