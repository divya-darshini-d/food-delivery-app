package com.foodDelivery.project.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Delivery")
public class Delivery
{
    public Delivery(int order_id, int agent_id,String pick_up_time, String drop_time, String delivery_status) {
        Order_id = order_id;
        Agent_id = agent_id;
        Pick_up_time = pick_up_time;
        Drop_time = drop_time;
        Delivery_status = delivery_status;
    }

    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

    private int Order_id;


    private int Agent_id;


    private String Pick_up_time;


    private String Drop_time;


    private String Delivery_status;

    public int getOrder_id() {
        return Order_id;
    }

    public void setOrder_id(int order_id) {
        Order_id = order_id;
    }

    public int getAgent_id() {
        return Agent_id;
    }

    public void setAgent_id(int agent_id) {
        Agent_id = agent_id;
    }

    public String getPick_up_time() {
        return Pick_up_time;
    }

    public void setPick_up_time(String pick_up_time) {
        Pick_up_time = pick_up_time;
    }

    public String getDrop_time() {
        return Drop_time;
    }

    public void setDrop_time(String drop_time) {
        Drop_time = drop_time;
    }

    public String getDelivery_status() {
        return Delivery_status;
    }

    public void setDelivery_status(String delivery_status) {
        Delivery_status = delivery_status;
    }

    public Delivery() {
    }
}
