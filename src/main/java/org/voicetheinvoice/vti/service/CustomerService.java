package org.voicetheinvoice.vti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.voicetheinvoice.vti.model.Customers;
import org.voicetheinvoice.vti.repository.CustomerRepository;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customers> getAllCustomers() {
        return customerRepository.findAll();
    }


    public Customers createCustomer(Customers customers) {
        return customerRepository.save(customers);
    }
}
