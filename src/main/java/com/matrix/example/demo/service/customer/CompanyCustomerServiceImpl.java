package com.matrix.example.demo.service.customer;

import com.matrix.example.demo.dao.entity.CustomerEntity;
import com.matrix.example.demo.dao.model.CustomerDto;
import com.matrix.example.demo.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyCustomerServiceImpl implements CustomerService {
    @Override
    public List<CustomerEntity> getCustomers() {
        return null;
    }

    @Override
    public void saveCustomer(CustomerEntity customerEntity) {

    }

    @Override
    public void editCustomer(Integer customerId, CustomerEntity customerEntity) {

    }

    @Override
    public List<CustomerEntity> findAll(String firstName) {
        return null;
    }

    @Override
    public CustomerDto getCustomerById(int id) {
        return null;
    }
}
