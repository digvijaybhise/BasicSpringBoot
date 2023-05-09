package com.geekster.RestaurantManagement.controller;

import com.geekster.RestaurantManagement.model.Restaurant;
import com.geekster.RestaurantManagement.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/restaurants")
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Restaurant> getAllRestaurants(){
        return restaurantService.getAllRestaurants();
    }

    @RequestMapping(value = "/getById/{id}", method = RequestMethod.GET)
    public Restaurant getRestaurant(@PathVariable int id){
        return restaurantService.getRestaurantsById(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addRestaurant(@RequestBody Restaurant restaurant){
        return restaurantService.addRestaurant(restaurant);
    }

    @DeleteMapping(value = "/deleteById/{id}")
    public String deleteById(@PathVariable int id){
        return restaurantService.deleteById(id);
    }

    @PutMapping(value = "/updateById/{id}")
    public String updateById(@PathVariable int id, @RequestBody Restaurant restaurant){
        return restaurantService.updateById(id, restaurant);
    }
}
