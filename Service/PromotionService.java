package com.foodDelivery.project.service;

import com.foodDelivery.project.Repository.PromotionRepo;
import com.foodDelivery.project.model.Promotion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PromotionService {

    @Autowired
    PromotionRepo promotionRepo;
    public List<Promotion> getAllpromotion() {
        return promotionRepo.findAll();
    }

    public Promotion getpromotionById(int id) {
        return promotionRepo.findById(id).orElse(new Promotion());
    }

    public void addpromotion(Promotion promotion) {
        promotionRepo.save(promotion);
    }

    public void updatepromotion(Promotion promotion) {
        promotionRepo.save(promotion);
    }

    public void deletepromotionById(int id) {
        promotionRepo.deleteById(id);
    }

    public void clearpromotion() {
        promotionRepo.deleteAll();
    }
}
