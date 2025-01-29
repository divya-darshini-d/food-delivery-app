package com.example.Payment.Service;

import com.example.Payment.Entity.DeliveryAgent;
import com.example.Payment.Repository.DeliveryAgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryAgentService {

    @Autowired
    DeliveryAgentRepository repository;

    public List<DeliveryAgent> getAllAgents() {
        return repository.findAll();
    }

    public void addAgent(DeliveryAgent agent) {
        repository.save(agent);
    }

    public DeliveryAgent getAgentById(int id) {
        return repository.findById(id).orElse(new DeliveryAgent());
    }

    public void updateAgent(DeliveryAgent agent) {
        repository.save(agent);
    }

    public void deleteAgentById(int id) {
        repository.deleteById(id);
    }

    public void deleteAllAgents() {
        repository.deleteAll();
    }
}