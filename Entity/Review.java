package com.foodDelivery.project.model;


import jakarta.persistence.*;
import lombok.Data;
import org.springframework.web.bind.annotation.RestController;

@Entity
@Data
@Table(name ="Reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private int review_id;

    @Column(name = "date")
    private String date;

    @Column(name = "order_id")
    private int order_id;

    @Column(name = "ratings")
    private int ratings;

    @Column(name = "delivery_status")
    private String delivery_status;

    public int getReview_id() {
        return review_id;
    }

    public void setReview_id(int review_id) {
        this.review_id = review_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    public String getDelivery_status() {
        return delivery_status;
    }

    public void setDelivery_status(String delivery_status) {
        this.delivery_status = delivery_status;
    }

    public Review(int review_id, String date, int order_id, int ratings, String delivery_status) {
        this.review_id = review_id;
        this.date = date;
        this.order_id = order_id;
        this.ratings = ratings;
        this.delivery_status = delivery_status;
    }

    public Review() {
    }
}
