package com.geekster.RestaurantManagement.repository;

import com.geekster.RestaurantManagement.model.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RestaurantDao {

    List<Restaurant> list;
    public RestaurantDao(){
        list = new ArrayList<>();
        list.add(new Restaurant(0 ,"Demo", "Pune", "225454512", "Roll", 1));
    }

    public List<Restaurant> getAll() {
        return list;
    }

    public void save(Restaurant restaurant) {
        list.add(restaurant);
    }

    public void delete(int id) {
        Restaurant delete =  getById(id);
        list.remove(delete);
    }

    public Restaurant getById(int id) {
        System.out.println("inside get by Id");
        for ( Restaurant restaurant : list ) {
            if(restaurant.getRId() == id) return restaurant;
            System.out.println("1111" + restaurant.getRId());
        }
        return null;
    }

    public String updateById(int id, Restaurant restaurant) {
        Restaurant rUpdate = getById(id);
        if(id >= 0) {
            rUpdate.setRName(restaurant.getRName());
            rUpdate.setRAddress(restaurant.getRAddress());
            rUpdate.setRNumber(restaurant.getRNumber());
            rUpdate.setRSpeciality(restaurant.getRSpeciality());
            rUpdate.setRTotalStaff(restaurant.getRTotalStaff());

            return "User with id " +  restaurant.getRId() + " updated Successfully...!!!";
        }
        return "Cannot find the restaurant with id " + restaurant.getRId();
    }
}
