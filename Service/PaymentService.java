package com.example.Payment.Service;

import com.example.Payment.Entity.Payments;
import com.example.Payment.Repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;
    public List<Payments> getAllPayments() {
        return paymentRepository.findAll();
    }


    public void addPayment(Payments payment) {
        paymentRepository.save(payment);
    }

    public Payments getPaymentById(int id) {
        return paymentRepository.findById(id).orElse(new Payments());
    }

    public void updatePayment(Payments payment) {
        paymentRepository.save(payment);
    }

    public void deletePaymentByPaymentId(int id) {
        paymentRepository.deleteById(id);
    }

    public void deleteAllPayments() {
        paymentRepository.deleteAll();
    }
}
