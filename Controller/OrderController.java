package com.foodDelivery.project.controller;

import com.foodDelivery.project.model.Order;
import com.foodDelivery.project.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("/order")
    public List<Order> getAllorder() {
        return orderService.getAllorder();
    }
    
    @GetMapping("/order/{id}")
    public Order getorderById(@PathVariable("id") int id) {
        return orderService.getorderById(id);
    }

    @PostMapping("/order")
    public String addOrder(@RequestBody Order order) {
        orderService.addorder(order);
        return "added..";
    }

    @PutMapping("/order")
    public String updateOrder(@RequestBody Order order){
        orderService.updateorder(order);
        return "updated..";
    }

    @DeleteMapping("/order/{id}")
    public String deleteOrder(@PathVariable int id){
        orderService.deleteorder(id);
        return "deleted..";
    }

    @DeleteMapping("/order/clear")
    public String deleteall(){
        orderService.deleteall();
        return "deleted order records";
    }
}
