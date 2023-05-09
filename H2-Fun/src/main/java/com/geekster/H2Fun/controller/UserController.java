package com.geekster.H2Fun.controller;

import com.geekster.H2Fun.model.Users;
import com.geekster.H2Fun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public Iterable<Users> getAll(){
        return userService.getAll();
    }

    @GetMapping("/users/{name}")
    public List<Users> getUsersByName(@PathVariable String name){
        return userService.getUserByName(name);
    }

    @GetMapping("/users/age/{age}")
    public List<Users> getUsersByAgeFactor(@PathVariable String age){
        return userService.getUserByAge(age);
    }

    @GetMapping("/users/{name}/graterThan/{age}")
    public List<Users> getUsersByNameAgeFactor(@PathVariable String name, @PathVariable String age){
        return userService.getUserByNameAge(name, age);
    }

    @GetMapping("/users/nameAndAge")
    public List<Users> getUsersByNameAndAgeFactor(@RequestParam String name, @RequestParam String age){
        return userService.getUserByNameAndAge(name, age);
    }

    @GetMapping("/users/sorted")
    public List<Users> getUsersSorted(){
        return userService.getAllSorted();
    }
    @PostMapping("/users")
    public String insertUser(@RequestBody List<Users> usersList){
        return userService.addUsers(usersList);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable Integer id){
        userService.removeUserById(id);
    }
}
