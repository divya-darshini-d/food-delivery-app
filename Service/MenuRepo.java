package com.foodDelivery.project.Service;

import com.foodDelivery.project.Model.menu;
import com.foodDelivery.project.Repo.MenuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    @Autowired
    MenuRepo menuRepo;

    public List<menu> getALLmenu() {
        return menuRepo.findAll();
    }

    public menu getmenuById(int id) {
        return menuRepo.findById(id).orElse(new menu());
    }

    public void addMenu(menu menu) {
        menuRepo.save(menu);
    }

    public void updatemenu(menu menu) {
        menuRepo.save(menu);
    }

    public void deletemenu(int id) {
        menuRepo.deleteById(id);
    }

    public void clearmenu() {
        menuRepo.deleteAll();
    }
}
