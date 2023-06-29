package com.nguyenminh.learnwebsite.services;

import com.nguyenminh.learnwebsite.product.Product;

import java.util.List;
import java.util.Optional;

public interface ProducDao {
    List<Product> getAllProduct() ;
    Optional<Product> getProductById(int theId) ;
    Product save(Product product) ;
    String  deleteProductById(int theId) ;

    Product updateProduct();


}
