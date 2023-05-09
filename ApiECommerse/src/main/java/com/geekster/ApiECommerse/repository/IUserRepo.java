package com.geekster.ApiECommerse.repository;

import com.geekster.ApiECommerse.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<Users, Integer> {
}
