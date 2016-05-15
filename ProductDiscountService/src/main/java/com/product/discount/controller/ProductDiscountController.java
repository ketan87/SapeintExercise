package com.product.discount.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.product.discount.model.Discount;
import com.product.discount.service.ProductDiscountService;

@RestController
public class ProductDiscountController {
 
    @Autowired
    ProductDiscountService prodDiscountService; 
 
     
  
     
    @RequestMapping(value = "/discount/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Discount> getDiscountForProduct(@PathVariable("id") int id) {
       Discount discount = prodDiscountService.getDiscountForProduct(id);
        if(discount == null){
            return new ResponseEntity<Discount>(HttpStatus.NOT_FOUND);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<Discount>(discount, HttpStatus.OK);
    }
 
 
  
     
   
}