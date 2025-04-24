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
    Product product1 = productRepository.save(product);
    return product1;
  }

  @Override
  public Product getProduct(String productId) {
    Product product = productRepository.getById(productId);
    return product;
  }

  /** Repository에서 기본적으로 제공하는 대표적인 메소드 */
  private void testRepositoryMethod() {
    /*    productRepository.save();
    productRepository.getById();
    productRepository.delete();
    productRepository.deleteAll();
    productRepository.findAll();
    productRepository.saveAll();*/
  }
}
