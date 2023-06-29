package com.nguyenminh.learnwebsite.services;

import com.nguyenminh.learnwebsite.product.Product;
import com.nguyenminh.learnwebsite.repositories.ProductRepo;

import javax.sound.sampled.Port;
import java.util.List;
import java.util.Optional;

public class ProductDaoImpl implements ProducDao {
    ProductRepo productRepo;

    public ProductDaoImpl (ProductRepo productRepo){
        this.productRepo = productRepo;
    }
    @Override
    public List<Product> getAllProduct() {
        return productRepo.findAll();
    }

    @Override
    public Optional<Product> getProductById(int theId) {
        return productRepo.findById(theId);
    }

    @Override
    public Product save(Product product) {
        return productRepo.save(product);
    }

    @Override
    public String deleteProductById(int theId) {
        productRepo.deleteById(theId);
        return "Deleted product id : " + theId ;
    }

    @Override
    public Product updateProduct(Product product){
     return    Optional<Product> product2 = Optional.of(productRepo.save(product));

    }
}
