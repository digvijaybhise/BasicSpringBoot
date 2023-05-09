package com.geekster.RestaurantManagement.service;

import com.geekster.RestaurantManagement.model.Restaurant;
import com.geekster.RestaurantManagement.repository.RestaurantDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    RestaurantDao restaurantDao;

    public List<Restaurant> getAllRestaurants() {
        return restaurantDao.getAll();
    }

    public Restaurant getRestaurantsById(int id) {
        return restaurantDao.getById(id);
    }

    public String addRestaurant(Restaurant restaurant) {
        restaurantDao.save(restaurant);
        return "Restaurant added successfully...!!!";
    }

    public String deleteById(int id) {
        restaurantDao.delete(id);
        return "Restaurant with id " + id + " gets deleted..!!";
    }

    public String updateById(int id, Restaurant restaurant) {
        return restaurantDao.updateById(id, restaurant);
    }
}
