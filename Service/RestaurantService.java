package com.foodDelivery.project.Service;

import com.foodDelivery.project.Model.restaurant;
import com.foodDelivery.project.Repo.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    RestaurantRepo restaurantRepo;
    public List<restaurant> getALLrestaurant() {
        return restaurantRepo.findAll();
    }


    public restaurant getrestaurantById(int id) {
        return restaurantRepo.findById(id).orElse(new restaurant());
    }

    public void addRestaurant(restaurant restaurant) {
        restaurantRepo.save(restaurant);
    }

    public void updaterestaurant(restaurant restaurant) {
        restaurantRepo.save(restaurant);
    }

    public void deleterestaurant(int id){
        restaurantRepo.deleteById(id);
    }

    public void deleteall() {
        restaurantRepo.deleteAll();
    }
}
