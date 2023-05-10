package com.geekster.ApiECommerse.controller;

import com.geekster.ApiECommerse.model.Product;
import com.geekster.ApiECommerse.model.Users;
import com.geekster.ApiECommerse.service.ProductService;
import com.geekster.ApiECommerse.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping()
    public void saveUser(@RequestBody Users users){
        userService.addUser(users);
    }

    @GetMapping("/{userId}")
    public Users getById(@PathVariable Integer userId){
        return userService.getById(userId);
    }
}
