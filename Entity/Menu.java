package com.foodDelivery.project.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "menu")
public class menu {

    @Id
    @Column(name = "menuid")
    private int id;

    @Column(name = "restid")
    private int restid;

    @Column(name = "category")
    private String category;

    @Column(name = "itemname")
    private String itemname;

    @Column(name = "ingredients")
    private String ingredients;

    @Column(name = "price")
    private int price;

    @Column(name = "availability")
    private boolean availability;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRestid() {
        return restid;
    }

    public void setRestid(int restid) {
        this.restid = restid;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public menu(int id, int restid, String category, String itemname, String ingredients, int price, boolean availability) {
        this.id = id;
        this.restid = restid;
        this.category = category;
        this.itemname = itemname;
        this.ingredients = ingredients;
        this.price = price;
        this.availability = availability;
    }

    public menu() {
    }
}
