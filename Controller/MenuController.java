package com.foodDelivery.project.Controller;

import com.foodDelivery.project.Model.menu;
import com.foodDelivery.project.Service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MenuController {

    @Autowired
    MenuService menuService;

    @GetMapping("/menu")
    public List<menu> getALLmenu(){
        return menuService.getALLmenu();
    }

    @GetMapping("/menu/{id}")
    public menu getmenuById(@PathVariable("id")int id){
        return menuService.getmenuById(id);
    }

    @PostMapping("/menu")
    public String addmenu(@RequestBody menu menu){
        menuService.addMenu(menu);
        return "added";
    }

    @PutMapping("/menu")
    public String updatemenu(@RequestBody menu menu){
        menuService.updatemenu(menu);
        return "updated";
    }

    @DeleteMapping("/menu/{id}")
    public String deletemenu(@PathVariable("id") int id){
        menuService.deletemenu(id);
        return "deleted";
    }

    @DeleteMapping("/menu")
    public String clearmenu(){
        menuService.clearmenu();
        return "cleared";
    }
}
