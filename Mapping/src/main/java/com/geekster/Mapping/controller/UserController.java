package com.geekster.Mapping.controller;

import com.geekster.Mapping.model.User;
import com.geekster.Mapping.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    IUserRepository userRepository;

    @PostMapping("/user")
    public void addUsers(@RequestBody User user){
        userRepository.save(user);
    }
}
