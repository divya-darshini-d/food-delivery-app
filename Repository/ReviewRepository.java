package com.foodDelivery.project.Repository;

import com.foodDelivery.project.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ReviewRepo  extends JpaRepository<Review,Integer> {

}
