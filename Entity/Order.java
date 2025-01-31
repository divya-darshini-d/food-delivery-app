package com.foodDelivery.project.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Orders")
public class Order {
    @Id
    @Column(name = "order_id")
    @GeneratedValue
    private int order_id;

    @Column(name = "payment_id")
    private int payment_id;

    @Column(name = "cancellation")
    private String cancellation;

    @Column(name = "promo_id")
    private int promo_id;

    @Column(name = "preparation_status")
    private String preparation_status;

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }

    public String getCancellation() {
        return cancellation;
    }

    public void setCancellation(String cancellation) {
        this.cancellation = cancellation;
    }

    public int getPromo_id() {
        return promo_id;
    }

    public void setPromo_id(int promo_id) {
        this.promo_id = promo_id;
    }

    public String getPreparation_status() {
        return preparation_status;
    }

    public void setPreparation_status(String preparation_status) {
        this.preparation_status = preparation_status;
    }

    public Order(int order_id, int payment_id, String cancellation, int promo_id, String preparation_status) {
        this.order_id = order_id;
        this.payment_id = payment_id;
        this.cancellation = cancellation;
        this.promo_id = promo_id;
        this.preparation_status = preparation_status;
    }

    public Order() {
    }
}


