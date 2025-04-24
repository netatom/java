package com.example.demo.data.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import com.example.demo.data.entity.Product;

public class ProductDto {

  @NotNull
  private String productId;

  @NotNull
  private String productName;

  @Min(500)
  @Max(3000000)
  private int productPrice;

  @Min(0)
  @Max(9999)
  private int productStock;

  public ProductDto() {}

  public ProductDto(String productId, String productName, int productPrice, int productStock) {
    this.productId = productId;
    this.productName = productName;
    this.productPrice = productPrice;
    this.productStock = productStock;
  }

  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public int getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(int productPrice) {
    this.productPrice = productPrice;
  }

  public int getProductStock() {
    return productStock;
  }

  public void setProductStock(int productStock) {
    this.productStock = productStock;
  }

  // Entity로 변환
  public Product toEntity() {
    return new Product(productId, productName, productPrice, productStock);
  }

  // Entity → DTO 변환
  public static ProductDto fromEntity(Product product) {
    return new ProductDto(product.getId(), product.getName(), product.getPrice(), product.getStock());
  }
}
