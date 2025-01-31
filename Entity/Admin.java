package com.foodDelivery.project.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Admin")
public class admin {

    @Id
    @Column(name = "Admin_Id")
    private int Id;

    @Column(name = "rest_id")
    private int Rest_Id;

    @Column(name = "agent_id")
    private int Agent_Id;

    @Column(name = "promo_id")
    private int Promo_Id;

    @Column(name = "review_id")
    private int Review_Id;

    @Column(name = "name")
    private String Name;

    @Column(name = "email")
    private String Email;

    @Column(name = "ph_no")
    private int Ph_no;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getRest_Id() {
        return Rest_Id;
    }

    public void setRest_Id(int rest_Id) {
        Rest_Id = rest_Id;
    }

    public int getAgent_Id() {
        return Agent_Id;
    }

    public void setAgent_Id(int agent_Id) {
        Agent_Id = agent_Id;
    }

    public int getPromo_Id() {
        return Promo_Id;
    }

    public void setPromo_Id(int promo_Id) {
        Promo_Id = promo_Id;
    }

    public int getReview_Id() {
        return Review_Id;
    }

    public void setReview_Id(int review_Id) {
        Review_Id = review_Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getPh_no() {
        return Ph_no;
    }

    public void setPh_no(int ph_no) {
        Ph_no = ph_no;
    }

    public admin(int id, int rest_Id, int agent_Id, int promo_Id, int review_Id, String name, String email, int ph_no) {
        Id = id;
        Rest_Id = rest_Id;
        Agent_Id = agent_Id;
        Promo_Id = promo_Id;
        Review_Id = review_Id;
        Name = name;
        Email = email;
        Ph_no = ph_no;
    }

    public admin() {
    }
}
