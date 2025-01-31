package com.foodDelivery.project.service;

import com.foodDelivery.project.Repository.ReviewRepo;
import com.foodDelivery.project.model.Review;
import jakarta.websocket.server.ServerEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReviewService {

    @Autowired
    ReviewRepo reviewRepo;

    public List<Review> getAllreview() {
        return reviewRepo.findAll();
    }

    public Review getreviewById(int id) {
        return reviewRepo.findById(id).orElse(new Review());
    }

    public void addreview(Review review) {
        reviewRepo.save(review);
    }

    public void updatereview(Review review) {
        reviewRepo.save(review);
    }

    public void deletereview(int id) {
        reviewRepo.deleteById(id);
    }

    public void deleteall() {
        reviewRepo.deleteAll();
    }
}
