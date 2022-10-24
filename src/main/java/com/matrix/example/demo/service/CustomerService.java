package com.matrix.example.demo.service;

import com.matrix.example.demo.client.model.CustomerDto;
import com.matrix.example.demo.dao.entity.CustomerEntity;

import java.util.List;

public interface CustomerService {
    List<CustomerDto> getCustomers();
    void saveCustomer(CustomerEntity customerEntity);

    void editCustomer(Integer customerId, CustomerEntity customerEntity);
    List<CustomerEntity> findAll(String firstName);
}
