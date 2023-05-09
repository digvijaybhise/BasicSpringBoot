package com.geekater.UserManagementSystem.Dao;

import com.geekater.UserManagementSystem.Model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {
    private List<User> userList;

    public UserDao(){
        userList = new ArrayList<>();
        userList.add(new User("1", "Digvijay", "digvijaybhise", "Pune", "654651346"));
    }

    public List<User> getAllUser(){
        return userList;
    }

    public boolean save(User user) {
        userList.add(user);
        return true;
    }

    public boolean remove(User user){
        userList.remove(user);
        return true;
    }

    public boolean checkForId(String userId) {
        for (User user: userList) {
            if(user.getUserId().equals(userId))return false;
        }
        return true;
    }

    public String update(String id, User user) {
        User user1 = getUserById(id);
        if(id != null) {
//            user1.setUserId(id);
            user1.setUserName(user.getUserName());
            user1.setName(user.getName());
            user1.setAddress(user.getAddress());
            user1.setPhoneNumber(user.getPhoneNumber());
            return "User with id " + user.getUserId() + " updated Successfully...!!!";
        }
        return "Cannot find the user with id " + user.getUserId();
    }

    public User getUserById(String id) {
        List<User> getCurrentList = userList;
        for(User user : getCurrentList){
            if(user.getUserId().equals(id)){
                return user;
            }
        }
        return null;
    }
}
