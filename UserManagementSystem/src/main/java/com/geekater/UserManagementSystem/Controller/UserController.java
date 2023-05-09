package com.geekater.UserManagementSystem.Controller;

import com.geekater.UserManagementSystem.Model.User;
import com.geekater.UserManagementSystem.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable String id){
        return userService.getUserById(id);
    }

    @PostMapping("/addUser")
    public String addUser(@Valid @RequestBody User user){
        return userService.addUser(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUserById(@PathVariable String id){
        return userService.remove(id);
    }

    @PutMapping("/updateUserInfo/{id}")
    public String updateUserById(@PathVariable String id, @RequestBody User user){
        return userService.updateUser(id, user);
    }

}
