package com.foodDelivery.project.controller;


import com.foodDelivery.project.model.Review;
import com.foodDelivery.project.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ReviewController {
    @Autowired
    ReviewService reviewService;

    @GetMapping("/review")
    public List<Review> getAllreview() {
        return reviewService.getAllreview();
    }

    @GetMapping("/review/{id}")
    public Review getreviewById(@PathVariable("id") int id) {
        return reviewService.getreviewById(id);
    }

    @PostMapping("/review")
    public String addreview(@RequestBody Review review) {
       reviewService.addreview(review);
        return "added..";
    }

    @PutMapping("/review")
    public String updatereview(@RequestBody Review review){
        reviewService.updatereview(review);
        return "updated..";
    }

    @DeleteMapping("/review/{id}")
    public String deletereview(@PathVariable int id){
       reviewService.deletereview(id);
        return "deleted..";
    }

    @DeleteMapping("/review/clear")
    public String deleteall(){
        reviewService.deleteall();
        return "deleted review records";
    }
}

