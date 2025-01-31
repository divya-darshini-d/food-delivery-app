package com.foodDelivery.project.Repository;

import com.foodDelivery.project.model.OrderItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemsRepo extends JpaRepository  <OrderItems,Integer> {
}
