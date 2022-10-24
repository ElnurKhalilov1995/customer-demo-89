package com.matrix.example.demo.service.customer;

import com.matrix.example.demo.client.model.CustomerDto;
import com.matrix.example.demo.dao.entity.CustomerEntity;
import com.matrix.example.demo.service.CustomerService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CompanyCustomerServiceImpl implements CustomerService {
    @Override
    public List<CustomerDto> getCustomers() {
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

}
