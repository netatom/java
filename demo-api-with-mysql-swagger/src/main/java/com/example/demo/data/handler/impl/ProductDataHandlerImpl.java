package com.example.demo.data.handler.impl;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.data.dao.ProductDAO;
import com.example.demo.data.entity.Product;
import com.example.demo.data.handler.ProductDataHandler;

@Service
public class ProductDataHandlerImpl implements ProductDataHandler {

  ProductDAO productDAO;

  @Autowired
  public ProductDataHandlerImpl(ProductDAO productDAO) {
    this.productDAO = productDAO;
  }

  @Override
  @Transactional
  public Product saveProductEntity(
      String productId, String productName, int productPrice, int productStock) {
	  
    Product product = new Product(productId, productName, productPrice, productStock);
    return productDAO.saveProduct(product);
    
  }

  @Override
  public Product getProductEntity(String productId) {

    return productDAO.getProduct(productId);
  }
}
