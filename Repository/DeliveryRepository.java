package com.foodDelivery.project.Repository;

import com.foodDelivery.project.model.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRepo extends JpaRepository  <Delivery,Integer> {
}
