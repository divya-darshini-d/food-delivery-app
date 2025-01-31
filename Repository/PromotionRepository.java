package com.foodDelivery.project.Repository;

import com.foodDelivery.project.model.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public interface PromotionRepo extends JpaRepository <Promotion,Integer> {
}
