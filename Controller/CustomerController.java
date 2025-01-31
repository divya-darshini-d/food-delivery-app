
package com.foodDelivery.project.controller;
 
import com.foodDelivery.project.service.CustomerService;
import com.foodDelivery.project.model.customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/customer")
    public List<customer> getAllcustomer() {
        return customerService.getAllcustomer();
    }

    @GetMapping("/customer/{id}")
    public customer getcustomerById(@PathVariable("id")int id){
        return customerService.getcustomerById(id);

    }
    @PostMapping("/customer")
    public String addCustomer(@RequestBody customer customer){
        customerService.addCustomer(customer);
        return "added..";
    }

    @PutMapping("/customer")
    public String updatecustomer(@RequestBody customer customer){
        customerService.updatecustomer(customer);
        return "updated";
    }

    @DeleteMapping("/customer/{id}")
    public String deletecustomer(@PathVariable int id){
        customerService.deletecustomerById(id);
        return "delete";


    }

    @DeleteMapping("/customer/clear")
    public String clearstudents() {
        customerService.clearstudents();
        return "AllDeleted";
    }
}

