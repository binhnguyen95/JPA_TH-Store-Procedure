package com.example.jpa_thstoreprocedure.service;

import com.example.jpa_thstoreprocedure.model.Customer;
import com.example.jpa_thstoreprocedure.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerService implements ICustomerService{

    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public boolean insertWithStoredProcedure(Customer customer) {
        return customerRepository.insertWithStoredProcedure(customer);
    }

}
