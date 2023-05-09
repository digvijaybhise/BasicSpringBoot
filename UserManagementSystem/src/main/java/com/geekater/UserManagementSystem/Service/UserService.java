package com.geekater.UserManagementSystem.Service;

import com.geekater.UserManagementSystem.Dao.UserDao;
import com.geekater.UserManagementSystem.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public List<User> getAllUser(){
        return userDao.getAllUser();
    }

    public User getUserById(String id) {
        return userDao.getUserById(id);
    }

    public String addUser(User user) {
        if(userDao.checkForId(user.getUserId())) {
            if (userDao.save(user)) {
                return "User added Successfully..!!!";
            } else {
                return "Failed !!! ... DataBase Error";
            }
        }else{
            return user.getUserId() + " is already present. Try using another id";
        }
    }

    public String remove(String id) {
        List<User> getCurrentList = userDao.getAllUser();
        if(id != null){
            for(User user : getCurrentList){
                if(user.getUserId().equals(id)){
                    userDao.remove(user);
                    return  "User with "+ id + " gets removed";
                }
            }
        }
        return "Cannot find the user with ; " + id;
    }

    public String updateUser(String id,User user) {
        return userDao.update(id, user);
    }
}
