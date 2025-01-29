package com.example.Payment.Controller;

import com.example.Payment.Entity.DeliveryAgent;
import com.example.Payment.Service.DeliveryAgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeliveryAgentController {

    @Autowired
    DeliveryAgentService service;

    @GetMapping("/agents")
    public List<DeliveryAgent> getAllAgents() {
        return service.getAllAgents();
    }

    @PostMapping("/agents")
    public String addAgent(@RequestBody DeliveryAgent agent) {
        service.addAgent(agent);
        return "Agent Added Successfully";
    }

    @GetMapping("/agents/{agent_id}")
    public DeliveryAgent getAgentById(@PathVariable("agent_id") int id) {
        return service.getAgentById(id);
    }

    @PutMapping("/agents")
    public String updateAgent(@RequestBody DeliveryAgent agent) {
        service.updateAgent(agent);
        return "Updated Successfully";
    }

    @DeleteMapping("/agents/{id}")
    public String deleteAgent(@PathVariable("id") int id) {
        service.deleteAgentById(id);
        return "Deleted Successfully";
    }

    @DeleteMapping("/agents/clearAll")
    public String deleteAllAgents() {
        service.deleteAllAgents();
        return "Deleted All Records";
    }
}
