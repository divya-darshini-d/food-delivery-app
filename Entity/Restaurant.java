package com.foodDelivery.project.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "restaurant")
public class restaurant {
    @Id
    @Column(name = "Rest_id")
    @GeneratedValue
    private int id;

    @Column(name = "Name")
    private String Name;

    @Column(name = "Ph_no")
    private int Ph_no;

    @Column(name = "review_id")
    private int review_id;

    @Column(name = "open_time")
    private String open_time;

    @Column(name = "address")
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPh_no() {
        return Ph_no;
    }

    public void setPh_no(int ph_no) {
        Ph_no = ph_no;
    }

    public int getReview_id() {
        return review_id;
    }

    public void setReview_id(int review_id) {
        this.review_id = review_id;
    }

    public String getOpen_time() {
        return open_time;
    }

    public void setOpen_time(String open_time) {
        this.open_time = open_time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public restaurant(int id, String name, int ph_no, int review_id, String open_time, String address) {
        this.id = id;
        Name = name;
        Ph_no = ph_no;
        this.review_id = review_id;
        this.open_time = open_time;
        this.address = address;
    }

    public restaurant() {
    }
}
