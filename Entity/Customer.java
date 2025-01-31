package com.foodDelivery.project.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Customer")
public class customer
{

     @Id
     @Column(name="ID")
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="Name")
    private String Name;

    @Column(name="Ph_no")
    private int ph_no;

    @Column(name="Cust_loc_id")
    private int cust_loc_id;

    @Column(name="Email_id")
    private String email_id;

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {this.email_id = email_id;}

    public int getCust_loc_id() {
        return cust_loc_id;
    }

    public void setCust_loc_id(int cust_loc_id) {
        this.cust_loc_id = cust_loc_id;
    }

    public int getPh_no() {
        return ph_no;
    }

    public void setPh_no(int ph_no) {
        this.ph_no = ph_no;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public customer(int id, String name, int ph_no, int cust_loc_id, String email_id) {
        this.id = id;
        Name = name;
        this.ph_no = ph_no;
        this.cust_loc_id = cust_loc_id;
        this.email_id = email_id;
    }
        public customer() {
        }
}
