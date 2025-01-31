package com.foodDelivery.project.Controller;

import com.foodDelivery.project.Model.restaurant;
import com.foodDelivery.project.Service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {


    @Autowired
    RestaurantService restaurantService;

    @GetMapping("/restaurant")
    public List<restaurant> getALLrestaurant(){
        return restaurantService.getALLrestaurant();
    }

    @GetMapping("/restaurant/{id}")
    public restaurant getrestaurantById(@PathVariable("id") int id){
        return restaurantService.getrestaurantById(id);
    }

    @PostMapping("/restaurant")
    public String addRestaurant(@RequestBody restaurant restaurant){
        restaurantService.addRestaurant(restaurant);
        return "added";
    }

    @PutMapping("/restaurant")
    public String updaterestaurant(@RequestBody restaurant restaurant){
        restaurantService.updaterestaurant(restaurant);
        return "updated";
    }

    @DeleteMapping("/restaurant/{id}")
    public String deleterestaurant(@PathVariable int id){
        restaurantService.deleterestaurant(id);
        return"deleted";
    }

    @DeleteMapping("/restaurant/clear")
    public String deleteall(){
        restaurantService.deleteall();
        return "deleted restaurant records";
    }

}
