package com.geekster.ApiECommerse.repository;

import com.geekster.ApiECommerse.model.Product;
import com.geekster.ApiECommerse.model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepo extends JpaRepository<Product, Integer> {

    public Product findProductByProductCategory(ProductCategory category);
}
