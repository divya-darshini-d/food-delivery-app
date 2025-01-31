package com.foodDelivery.project.Controller;

import com.foodDelivery.project.Model.admin;
import com.foodDelivery.project.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    AdminService adminService;

    @GetMapping("/admin")
    public List<admin> getALLadmin(){
        return adminService.getALLAdmin();
    }

    @GetMapping("/admin/{id}")
    public admin getadminById(@PathVariable("id") int id){
        return adminService.getadminById(id);
    }

    @PostMapping("/admin")
    public String addAdmin(@RequestBody admin admin){
        adminService.addAdmin(admin);
        return "added";
    }

    @PutMapping("/admin")
    public String updateadmin(@RequestBody admin admin) {
        adminService.updateadmin(admin);
        return "Updated";
    }

    @DeleteMapping("/admin/{id}")
    public String deleteadmin(@PathVariable int id){
        adminService.deleteadmin(id);
        return "deleted";
    }

    @DeleteMapping("/admin/clear")
    public String deleteall(){
        adminService.deleteall();
        return "deleted admin records";
    }
}
