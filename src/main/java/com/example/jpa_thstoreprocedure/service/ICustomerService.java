package com.example.jpa_thstoreprocedure.service;

import com.example.jpa_thstoreprocedure.model.Customer;

public interface ICustomerService {
    boolean insertWithStoredProcedure(Customer customer);
}
