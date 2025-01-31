package com.foodDelivery.project.controller;


import com.foodDelivery.project.model.OrderItems;
import com.foodDelivery.project.service.OrderItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderItemsController {
    @Autowired
    OrderItemsService orderitemsService;

    @GetMapping("/orderitem")
    public List<OrderItems> getAllOrderitems() {
        return orderitemsService.getAllorderitems();
    }

    @GetMapping("/orderitem/{id}")
    public OrderItems getorderitemsById(@PathVariable("id") int id){
        return orderitemsService.getorderitemsById(id);
    }

    @PostMapping("/orderitem")
    public String addOrderitems(@RequestBody OrderItems orderitems){
        orderitemsService.addOrderitems(orderitems);
        return "added..";
    }

    @PutMapping("/orderitem")
    public String updateOrderitems(@RequestBody OrderItems orderitems){
        orderitemsService.updateOrderitems(orderitems);
        return "updated..";
    }

    @DeleteMapping("/orderitems/{id}")
    public String deleteOrderitems(@PathVariable int id){
        orderitemsService.deleteOrderitems(id);
        return "deleted..";
    }

    @DeleteMapping("/orderitem/clear")
    public String deleteall(){
        orderitemsService.deleteall();
        return "deleted orderitems records..";
    }
}




