package com.geekster.ApiECommerse.controller;

import com.geekster.ApiECommerse.model.Product;
import com.geekster.ApiECommerse.model.ProductCategory;
import com.geekster.ApiECommerse.service.ProductService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping()
    public void saveProduct(@RequestBody Product product){
        productService.addProduct(product);
    }

    @GetMapping("/category/{category}")
    public Product getProductByCategory(@PathVariable String category){
        return productService.findByCategory(ProductCategory.valueOf(category));
    }

    @DeleteMapping("/{productId}")
    ResponseEntity<Void> removeProduct(@PathVariable Integer productId){

        HttpStatus status;

        try {
            productService.deleteById(productId);
            status = HttpStatus.ACCEPTED;
        }catch (Exception e){
            status = HttpStatus.BAD_REQUEST;
        }

        return new ResponseEntity<Void>(status);
    }
}
