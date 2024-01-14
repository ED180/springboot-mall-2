package com.ED.springbootmall.dao;

import com.ED.springbootmall.constant.ProductCategory;
import com.ED.springbootmall.dto.ProductQueryParams;
import com.ED.springbootmall.dto.ProductRequest;
import com.ED.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductQueryParams productQueryParams);
    Integer countProduct(ProductQueryParams productQueryParams);
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProduct(Integer productId);

}
