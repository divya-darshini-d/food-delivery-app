package com.foodDelivery.project.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "OrderItem")
public class OrderItems {

    @Id
    @Column(name = "order_id")
    private int order_id;

    @Column(name = "preparation_status")
    private String preparation_status;

    @Column(name = "item_price")
    private int item_price;

    @Column(name = "quantity")
    private int quantity;


    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getPreparation_status() {
        return preparation_status;
    }

    public void setPreparation_status(String preparation_status) {
        this.preparation_status = preparation_status;
    }

    public int getItem_price() {
        return item_price;
    }

    public void setItem_price(int item_price) {
        this.item_price = item_price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



    public OrderItems(int order_id, String preparation_status, int item_price, int quantity) {
        this.order_id = order_id;
        this.preparation_status = preparation_status;
        this.item_price = item_price;
        this.quantity = quantity;

    }

    public OrderItems() {
    }
}
