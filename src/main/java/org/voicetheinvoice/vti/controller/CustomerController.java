package org.voicetheinvoice.vti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.voicetheinvoice.vti.model.Customers;
import org.voicetheinvoice.vti.service.CustomerService;

import java.util.List;
@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<Customers> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @PostMapping
    public Customers createCustomer(@RequestBody Customers customers) {
        return customerService.createCustomer(customers);
    }
}

