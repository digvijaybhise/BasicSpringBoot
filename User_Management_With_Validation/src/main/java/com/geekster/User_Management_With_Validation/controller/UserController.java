package com.geekster.User_Management_With_Validation.controller;

import com.geekster.User_Management_With_Validation.model.User;
import com.geekster.User_Management_With_Validation.sevice.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getAll")
    public List<User> getAllUsers(){
        return userService.getAllUser();
    }

    @GetMapping("/getUser/{id}")
    public User getUserById(@Valid @PathVariable String id){
        return userService.getUserById(id);
    }

    @PostMapping("/addUser")
    public String addUser(@Valid @RequestBody User user){
        return userService.addUser(user);
    }

    @PutMapping("/updateUser/{id}")
    public String updateUser(@Valid @PathVariable String id, @Valid @RequestBody User user){
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@Valid @PathVariable String id){
        return userService.deleteUser(id);
    }
}
