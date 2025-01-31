package com.foodDelivery.project.service;

import com.foodDelivery.project.Repository.CustomerRepo;
import com.foodDelivery.project.model.customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerService {


    @Autowired
    CustomerRepo customerRepo;
    public List<customer> getAllcustomer() {
        return customerRepo.findAll();
    }

    public void addCustomer(customer customer) {
        customerRepo.save(customer);

    }
    public customer getcustomerById(int id) {
        return customerRepo.findById(id).orElse(new customer());
    }

    public boolean updatecustomer(customer customer) {
        customerRepo.save(customer);
        return false;
    }

    public boolean deletecustomerById(int id) {
        customerRepo.deleteById(id);
        return false;
    }

    public void clearstudents() {
        customerRepo.deleteAll();
    }
}
