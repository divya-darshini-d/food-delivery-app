package com.foodDelivery.project.Service;


import com.foodDelivery.project.Model.admin;
import com.foodDelivery.project.Repo.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    AdminRepo adminRepo;


    public List<admin> getALLAdmin() {
        return adminRepo.findAll();
    }


    public admin getadminById(int id) {
        return adminRepo.findById(id).orElse(new admin());
    }

    public void updateadmin(admin admin) {
        adminRepo.save(admin);
    }

    public void addAdmin(admin admin) {
        adminRepo.save(admin);
    }

    public void deleteadmin(int id) {
        adminRepo.deleteById(id);
    }

    public void deleteall() {
        adminRepo.deleteAll();
    }
}
