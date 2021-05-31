package com.samet.springbootproductmicroservices.service;

import com.samet.springbootproductmicroservices.model.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);

    void deleteProduct(Long productId);

    List<Product> findAllProducts();
}
