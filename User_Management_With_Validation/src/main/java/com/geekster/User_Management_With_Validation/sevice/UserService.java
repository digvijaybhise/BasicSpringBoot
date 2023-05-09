package com.geekster.User_Management_With_Validation.sevice;

import com.geekster.User_Management_With_Validation.model.User;
import com.geekster.User_Management_With_Validation.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public List<User> getAllUser(){
        return userDao.getList();
    }

    public User getUserById(String id) {
        return userDao.getUserById(id);
    }

    public String addUser(User user) {
        if(userDao.save(user)) {
            return "User with " + user.getUserId() + " gets added successfully ...!!!";
        }
        return user.getUserId() + " is already present in the system. Try using another ID";
    }

    public String updateUser(String id, User user) {
        if(userDao.updateUser(id, user)){
            return "User with " + id + " gets updated.";
        }
        return "Cannot find user with userId : " + id;
    }

    public String deleteUser(String id) {
        if(userDao.deleteUser(id)){
            return "User with " + id + " deleted successfully..!!";
        }
        return "Cannot find user with userId : " + id;
    }
}
