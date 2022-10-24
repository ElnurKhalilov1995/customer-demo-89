package com.matrix.example.demo.service.customer;

import com.matrix.example.demo.client.Demo12Client;
import com.matrix.example.demo.client.model.CustomerDto;
import com.matrix.example.demo.dao.entity.CustomerEntity;
import com.matrix.example.demo.dao.repository.CustomerRepository;
import com.matrix.example.demo.mapper.CustomerMapper;
import com.matrix.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RetailCustomerServiceImpl implements CustomerService {
    @Value("${pass}")
    private String password;
    private CustomerRepository customerRepository;
    private Demo12Client demo12Client;

    public RetailCustomerServiceImpl(CustomerRepository customerRepository, Demo12Client demo12Client) {
        this.customerRepository = customerRepository;
        this.demo12Client = demo12Client;
    }

    @Override
    public List<CustomerDto> getCustomers() {
        var customers = demo12Client.getCustomerList();
        return customers;
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

//    @Override
//    public CustomerDto getCustomerById(Integer id) {
//        var entity = customerRepository.findById(id).get();
//        return CustomerMapper.INSTANCE.mapToDto(entity);
//    }
}
