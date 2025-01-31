package com.foodDelivery.project.service;

import com.foodDelivery.project.Repository.OrderRepo;
import com.foodDelivery.project.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepo orderRepo;
    public List<Order> getAllorder() {
        return orderRepo.findAll();
    }

    public Order getorderById(int id) {
        return orderRepo.findById(id).orElse(new  Order());
    }

    public void addorder(Order order) {
        orderRepo.save(order);
    }

    public void updateorder(Order order) {
        orderRepo.save(order);
    }

    public void deleteorder(int id) {
        orderRepo.deleteById(id);
    }

    public void deleteall() {
        orderRepo.deleteAll();
    }
}
