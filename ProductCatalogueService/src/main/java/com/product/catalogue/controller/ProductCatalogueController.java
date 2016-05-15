package com.product.catalogue.controller;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.product.catalogue.model.Product;
import com.product.catalogue.service.ProductCatalogueService;

@RestController
public class ProductCatalogueController {
 
    @Autowired
    ProductCatalogueService prodCatalogueService; 
 
     
  
     
    @RequestMapping(value = "/products/{category}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Product>> listAllProducts(@PathVariable("category") String category) {
        List<Product> products = prodCatalogueService.findAllProducts(category);
        if(products.isEmpty()){
            return new ResponseEntity<List<Product>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
    }
 
 
  
     
   
}