package com.example.jpa_thstoreprocedure.repository;

import com.example.jpa_thstoreprocedure.model.Customer;

public interface ICustomerRepository {
    boolean insertWithStoredProcedure(Customer customer);
}
