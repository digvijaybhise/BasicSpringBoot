package com.geekster.ApiECommerse.repository;

import com.geekster.ApiECommerse.model.Address;
import com.geekster.ApiECommerse.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrdersRepo extends JpaRepository<Orders, Long> {
}
