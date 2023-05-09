package com.geekster.ApiECommerse.repository;

import com.geekster.ApiECommerse.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends JpaRepository<Address, Integer> {
}
