package com.matrix.example.demo.controller.customer;

import com.matrix.example.demo.client.model.CustomerDto;
import com.matrix.example.demo.dao.entity.CustomerEntity;
import com.matrix.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/company-customers")
public class CompanyCustomerController {

    private final CustomerService customerService;

    public CompanyCustomerController(
            @Qualifier("companyCustomerServiceImpl") CustomerService customerService
    ) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<CustomerDto> getCustomers() {
        return customerService.getCustomers();
    }
}
