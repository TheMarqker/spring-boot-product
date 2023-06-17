package com.sha.springbootproduct.service;

import com.sha.springbootproduct.model.Product;

import java.util.List;

public interface ProductService {
    abstract Product saveProduct(Product product);

    void deleteProduct(Long id);

    List<Product> findAllProducts();
}
