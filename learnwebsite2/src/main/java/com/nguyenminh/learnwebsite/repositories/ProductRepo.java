package com.nguyenminh.learnwebsite.repositories;

import com.nguyenminh.learnwebsite.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
