package com.nguyenminh.learnwebsite.controller;

import com.nguyenminh.learnwebsite.product.Product;
import com.nguyenminh.learnwebsite.services.ProductDaoImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ApiController {
    ProductDaoImpl productDaoImpl;
    public ApiController(ProductDaoImpl productDaoImpl){
        this.productDaoImpl = productDaoImpl;

    }

    @GetMapping("/product")
    public List<Product> getAllProduct(){
       return productDaoImpl.getAllProduct();
    }

    @GetMapping ("/product/{theId}")
    public Optional<Product> getProductById(@PathVariable int theId){
        return productDaoImpl.getProductById(theId);
    }

    @PostMapping("/add_product")
    public Product getAllProduct(@RequestBody Product product){
        return productDaoImpl.save(product);
    }

    @DeleteMapping("/delete_product/{theId}")
    public String getAllProduct(@PathVariable int theId){
        return productDaoImpl.deleteProductById(theId);
    }




}
