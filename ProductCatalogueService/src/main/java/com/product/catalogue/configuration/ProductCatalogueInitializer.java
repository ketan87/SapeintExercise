package com.product.catalogue.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ProductCatalogueInitializer extends AbstractAnnotationConfigDispatcherServletInitializer  {
 
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { ProductCatalogueConfiguration.class };
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