package com.example.demo.controller;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.dto.ProductDto;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/api/v1/product-api")
public class ProductController {

  private final ProductService productService;

  @Autowired
  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  // http://localhost:8080/api/v1/product-api/product/{productId}
  @GetMapping(value = "/product/{productId}")
  public ProductDto getProduct(@PathVariable String productId) {
    ProductDto productDto = productService.getProduct(productId);
    return productDto;
  }

  @PostMapping(value = "/product")
  public ResponseEntity<ProductDto> createProduct(@Valid @RequestBody ProductDto productDto) {
    String productId = productDto.getProductId();
    String productName = productDto.getProductName();
    int productPrice = productDto.getProductPrice();
    int productStock = productDto.getProductStock();
    ProductDto response = productService.saveProduct(productId, productName, productPrice, productStock);
    return ResponseEntity.status(HttpStatus.OK).body(response);
  }

}
