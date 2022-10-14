package com.matrix.example.demo.service;

import com.matrix.example.demo.dao.entity.CustomerEntity;
import com.matrix.example.demo.dao.model.CustomerDto;

import java.util.List;

public interface CustomerService {
    List<CustomerEntity> getCustomers();
    void saveCustomer(CustomerEntity customerEntity);

    void editCustomer(Integer customerId, CustomerEntity customerEntity);
    List<CustomerEntity> findAll(String firstName);

    CustomerDto getCustomerById(int id);
}
