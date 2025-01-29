package com.example.Payment.Controller;

import com.example.Payment.Entity.Payments;
import com.example.Payment.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaymentController {

    @Autowired
    PaymentService service;

    @GetMapping("/payments")
    public List<Payments> getAllPayments() {
        return service.getAllPayments();
    }

    @PostMapping("payments")
    public String addPayment(@RequestBody Payments payment) {
        service.addPayment(payment);
        return "Payment Added Successfully";
    }

    @GetMapping("/{payment_id}")
    public Payments getPaymentById(@PathVariable("payment_id") int id) {
        return service.getPaymentById(id);
    }

    @PutMapping("payments")
    public String updatePayment(@RequestBody Payments payment) {
        service.updatePayment(payment);
        return "Updated";
    }

    @DeleteMapping("/delete/{id}")
    public String deletePayment(@PathVariable("id") int id) {
        service.deletePaymentByPaymentId(id);
        return ("Deleted");

    }

    @DeleteMapping("/delete/clearAll")
    public String deleteAllPayments() {
        service.deleteAllPayments();
        return ("Deleted all records");

    }
}
