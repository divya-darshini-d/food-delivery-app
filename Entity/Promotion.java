package com.foodDelivery.project.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name ="promotion")
public class Promotion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "promo_id")
    private int promo_id;

    @Column(name = "promo_codes")
    private String promo_codes;

    @Column(name = "payment_id")
    private int payment_id;


    public int getPromo_id() {
        return promo_id;
    }

    public void setPromo_id(int promo_id) {
        this.promo_id = promo_id;
    }

    public String getPromo_codes() {
        return promo_codes;
    }

    public void setPromo_codes(String promo_codes) {
        this.promo_codes = promo_codes;
    }

    public int getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }

    public Promotion(int promo_id, String promo_codes, int payment_id) {
        this.promo_id = promo_id;
        this.promo_codes = promo_codes;
        this.payment_id = payment_id;
    }

    public Promotion() {
    }
}
