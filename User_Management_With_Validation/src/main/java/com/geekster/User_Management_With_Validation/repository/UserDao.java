package com.geekster.User_Management_With_Validation.repository;

import com.geekster.User_Management_With_Validation.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {

    List<User> list;
    UserDao(){
        list = new ArrayList<>();
        list.add(new User("0", "Demo", "21/2/2000", "abc@demo", "4565845232", LocalDate.now(), LocalTime.now()));
    }

    public List<User> getList() {
        return list;
    }

    public User getUserById(String id) {
        for(User user : list){
            if(user.getUserId().equals(id)) return user;
        }
        return null;
    }

    public boolean save(User user) {
        if(find(user.getUserId())) return false;
        else {
            list.add(user);
            return true;
        }
    }

    public boolean updateUser(String id, User user) {
        if(find(id)) {
            User temp = getUserById(id);
            temp.setUserName(user.getUserName());
            temp.setEmail(user.getEmail());
            temp.setDateOfBirth(user.getDateOfBirth());
            temp.setPhoneNumber(user.getPhoneNumber());
            temp.setTime(user.getTime());
            temp.setDate(user.getDate());

            return true;
        }
        return false;
    }

    public boolean find(String id){
        for(User user : list){
            if(user.getUserId().equals(id)) return true;
        }
        return false;
    }

    public boolean deleteUser(String id) {
        if(find(id)){
            User temp = getUserById(id);
            list.remove(temp);
            return true;
        }
        return false;
    }
}
