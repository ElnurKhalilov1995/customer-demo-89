package com.matrix.example.demo.service.customer;

import com.matrix.example.demo.dao.entity.CustomerEntity;
import com.matrix.example.demo.dao.repository.CustomerRepository;
import com.matrix.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RetailCustomerServiceImpl implements CustomerService {
    @Value("${pass}")
    private String password;
    private CustomerRepository customerRepository;

    public RetailCustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<CustomerEntity> getCustomers() {
        var customers = customerRepository.findAll();
        return (List<CustomerEntity>) customers;
    }

    @Override
    public void saveCustomer(CustomerEntity customerEntity) {
        customerRepository.save(customerEntity);
    }

    @Override
    public void editCustomer(Integer customerId, CustomerEntity customerEntity) {
        customerEntity.setId(customerId);
        customerRepository.save(customerEntity);
    }

    @Override
    public List<CustomerEntity> findAll(String firstName) {
        return customerRepository.findAll(firstName);
    }

    @Override
    public CustomerEntity getCustomerById(Integer id) {
        return customerRepository.findById(id).get();
    }
}
