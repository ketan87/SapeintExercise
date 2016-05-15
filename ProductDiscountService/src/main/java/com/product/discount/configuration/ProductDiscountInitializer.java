package com.product.discount.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ProductDiscountInitializer extends AbstractAnnotationConfigDispatcherServletInitializer  {
 
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { ProductDiscountConfiguration.class };
    }
  
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }
  
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
 
}