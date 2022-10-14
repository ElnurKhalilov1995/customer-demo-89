package com.matrix.example.demo.service.customer;

import com.matrix.example.demo.dao.entity.CustomerEntity;
import com.matrix.example.demo.mapper.CustomerMapper;
import com.matrix.example.demo.model.CustomerDto;
import com.matrix.example.demo.model.repository.CustomerRepository;
import com.matrix.example.demo.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyCustomerServiceImpl implements CustomerService {
    private  final CustomerRepository customerRepository;

    public CompanyCustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<CustomerEntity> getCustomers() {
        var company = customerRepository.findAll();
        return (List<CustomerEntity>) company;
    }

    @Override
    public void saveCustomer(CustomerEntity customerEntity) {
        customerRepository.save(customerEntity);

    }

    @Override
    public void editCustomer(Integer customerId, CustomerEntity customerEntity) {

    }

    @Override
    public List<CustomerEntity> findAll(String firstName) {
        return customerRepository.findAll(firstName) ;
    }

    @Override
    public CustomerDto getCustomerById(Integer id) {
        var entity =  customerRepository.findById(id).get();
        return CustomerMapper.INSTANCE.mapToDto(entity);

    }
}
