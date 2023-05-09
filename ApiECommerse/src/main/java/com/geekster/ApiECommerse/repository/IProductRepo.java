package com.geekster.ApiECommerse.repository;

import com.geekster.ApiECommerse.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepo extends JpaRepository<Product, Integer> {
}
