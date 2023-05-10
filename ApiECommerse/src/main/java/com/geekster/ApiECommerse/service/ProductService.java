package com.geekster.ApiECommerse.service;

import com.geekster.ApiECommerse.model.Product;
import com.geekster.ApiECommerse.model.ProductCategory;
import com.geekster.ApiECommerse.repository.IProductRepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.net.http.HttpRequest;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    IProductRepo productRepo;


    public void addProduct(Product product) {
        productRepo.save(product);
    }

    public Product findByCategory(ProductCategory category) {
        return productRepo.findProductByProductCategory(category);
    }

    public void deleteById(Integer productId) {

        if(productRepo.existsById(productId)){
            productRepo.deleteById(productId);
        }else {
            throw new EntityNotFoundException("Please Fill the Valid Details..!!!");
        }
    }
}
