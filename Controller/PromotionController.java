
package com.foodDelivery.project.controller;

import com.foodDelivery.project.model.Promotion;
import com.foodDelivery.project.service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PromotionController {

    @Autowired
    PromotionService promotionService;

    @GetMapping("/promotion")
    public List<Promotion> getAllpromotion() {
        return promotionService.getAllpromotion();
    }

    @GetMapping("/promotion/{id}")
    public Promotion getpromotionById(@PathVariable("id")int id){
        return promotionService.getpromotionById(id);

    }
    @PostMapping("/promotion")
    public String addpromotion(@RequestBody Promotion promotion){
        promotionService.addpromotion(promotion);
        return "added..";
    }

    @PutMapping("/promotion")
    public String updatepromotion(@RequestBody Promotion promotion){
        promotionService.updatepromotion(promotion);
        return "updated";
    }

    @DeleteMapping("/promotion/{id}")
    public String deletepromotion(@PathVariable int id){
        promotionService.deletepromotionById(id);
        return "deleted";
    }

    @DeleteMapping("/promotion/clear")
    public String clearpromotion() {
        promotionService.clearpromotion();
        return "AllDeleted";
    }
}


