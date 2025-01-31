package com.foodDelivery.project.controller;

import com.foodDelivery.project.model.Delivery;
import com.foodDelivery.project.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class DeliveryController {

    @Autowired
    DeliveryService deliveryService;


    @GetMapping("/delivery")
    public List<Delivery> getAlldelivery() {
        return deliveryService.getAlldelivery();
    }

    @GetMapping("/delivery/{id}")
    public Delivery getdeliveryByID(@PathVariable("id") int id) {
        return deliveryService.getDeliveryById(id);

    }

    @PostMapping("/delivery")
    public String addDelivery(@RequestBody Delivery Delivery) {
        deliveryService.addDelivery(Delivery);
        return "added..";


    }

    @PutMapping("/delivery/")
    public String updateDelivery(@RequestBody Delivery Delivery) {
        deliveryService.updateDelivery(Delivery);
        return "updated";
    }

    @DeleteMapping("/delivery/{id}")
    public String deleteDelivery(@PathVariable int id) {
        deliveryService.deleteDeliveryByID(id);
        return "delete";


    }

    @DeleteMapping("/delivery/clear")
    public String clearDelivery() {
        deliveryService.clearDelivery();
        return "AllDeleted";
    }
}
