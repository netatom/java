package com.example.demo.data.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.data.dao.ProductDAO;
import com.example.demo.data.entity.Product;
import com.example.demo.data.repository.ProductRepository;

@Service
public class ProductDAOImpl implements ProductDAO {

  ProductRepository productRepository;

  @Autowired
  public ProductDAOImpl(ProductRepository productRepository) {

    this.productRepository = productRepository;
  }

  @Override
  public Product saveProduct(Product product) {
    return productRepository.save(product);
  }

  @Override
  public Product getProduct(String productId) {
    return productRepository.getById(productId);
  }

}
