package com.foodDelivery.project.service;


import com.foodDelivery.project.Repository.DeliveryRepo;
import com.foodDelivery.project.model.Delivery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class DeliveryService{


    @Autowired
   DeliveryRepo deliveryRepo;
    public List<Delivery> getAlldelivery() {return deliveryRepo.findAll();
    }

    public void addDelivery(Delivery Delivery) {
       deliveryRepo.save(Delivery);

    }

    public void updateDelivery(Delivery Delivery) {
     deliveryRepo.save(Delivery);
    }

    public void deleteDeliveryByID(int id) {
       deliveryRepo.deleteById(id);
    }

    public void clearDelivery() {
        deliveryRepo.deleteAll();
    }
    public Delivery getDeliveryById(int id) {
        return deliveryRepo.findById(id).orElse(new Delivery());
    }
}
