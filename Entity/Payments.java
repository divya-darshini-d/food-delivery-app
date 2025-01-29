package com.example.Payment.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Payments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int payment_Id;

    private int customer_id;
    private String status;
    private String payment_Mode;
    private String date;
    private float amount;
    private boolean refund;

    public int getPayment_Id() {
        return payment_Id;
    }

    public void setPayment_Id(int payment_Id) {
        this.payment_Id = payment_Id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPayment_Mode() {
        return payment_Mode;
    }

    public void setPayment_Mode(String payment_Mode) {
        this.payment_Mode = payment_Mode;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public boolean isRefund() {
        return refund;
    }

    public void setRefund(boolean refund) {
        this.refund = refund;
    }

    public Payments() {
    }
}


