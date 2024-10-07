package org.voicetheinvoice.vti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.voicetheinvoice.vti.model.Customer;
import org.voicetheinvoice.vti.repository.CustomerRepository;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }


    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
