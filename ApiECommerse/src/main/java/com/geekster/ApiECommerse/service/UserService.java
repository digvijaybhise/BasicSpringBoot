package com.geekster.ApiECommerse.service;

import com.geekster.ApiECommerse.model.Product;
import com.geekster.ApiECommerse.model.Users;
import com.geekster.ApiECommerse.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    IUserRepo userRepo;

    public void addUser(Users users) {
        userRepo.save(users);
    }

    public Users getById(Integer userId) {
        return userRepo.findById(userId).get();
    }
}
