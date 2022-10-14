package com.matrix.example.demo.service.customer;

import com.matrix.example.demo.dao.entity.CustomerEntity;
import com.matrix.example.demo.model.CustomerDto;
import com.matrix.example.demo.model.repository.CustomerRepository;
import com.matrix.example.demo.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RetailCustomerServiceImpl implements CustomerService {

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
    public CustomerDto getCustomerById(Integer id) {
        return null;
    }
}
