package com.geekster.H2Fun.service;

import com.geekster.H2Fun.model.Users;
import com.geekster.H2Fun.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    IUserRepository userRepository;

    public Iterable<Users> getAll(){
        Iterable<Users> allUsers = userRepository.findAll();
        return allUsers;
    }

    public List<Users> getAllSorted(){
        return userRepository.findUsersOrderByAge();
    }

    public String addUsers(List<Users> usersList) {
        Iterable<Users> addedUsers = userRepository.saveAll(usersList);
        if(addedUsers != null){
            return "Yes";
        }
        return "No";
    }

    public void removeUserById(Integer id) {
        userRepository.deleteById(id);
    }

    public List<Users> getUserByName(String name) {
        return userRepository.findByName(name);
    }

    public List<Users> getUserByAge(String age) {
        Integer userAge = Integer.parseInt(age);
        return userRepository.findByAgeGreaterThan(userAge);
    }

    public List<Users> getUserByNameAge(String name, String age) {
        Integer userAge = Integer.parseInt(age);
        return userRepository.findByNameOrAgeGreaterThan(name, userAge);
    }

    public List<Users> getUserByNameAndAge(String name, String age) {
        Integer userAge = Integer.parseInt(age);
        return userRepository.findByNameAndAgeGreaterThan(name, userAge);
    }
}
