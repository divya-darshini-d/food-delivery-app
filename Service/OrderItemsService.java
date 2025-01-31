package com.foodDelivery.project.service;

import com.foodDelivery.project.Repository.OrderItemsRepo;
import com.foodDelivery.project.model.OrderItems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemsService {

    @Autowired
    OrderItemsRepo orderitemsRepo;
    public List<OrderItems> getAllorderitems() {
        return orderitemsRepo.findAll();
    }

    public OrderItems getorderitemsById(int id) {
      return orderitemsRepo.findById(id).orElse(new OrderItems());
    }

    public void addOrderitems(OrderItems orderitems) {
        orderitemsRepo.save(orderitems);

    }

    public void updateOrderitems(OrderItems orderitems) {
        orderitemsRepo.save(orderitems);
    }

    public void deleteOrderitems(int id) {
        orderitemsRepo.deleteById(id);
         }

    public void deleteall() {
        orderitemsRepo.deleteAll();
    }
}
