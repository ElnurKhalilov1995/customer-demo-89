package com.matrix.example.demo.controller.customer;

import com.matrix.example.demo.client.model.CustomerDto;
import com.matrix.example.demo.dao.entity.CustomerEntity;
import com.matrix.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/retail-customers")
public class RetailCustomerController {
    private CustomerService customerService;
    private PasswordEncoder passwordEncoder;


    public RetailCustomerController(
            @Qualifier("retailCustomerServiceImpl") CustomerService customerService,
            PasswordEncoder passwordEncoder
    ) {
        this.customerService = customerService;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/crypt/{text}")
    public String cryptPass(@PathVariable String text) {
        return passwordEncoder.encode(text);
    }

    @GetMapping
    public List<CustomerDto> getCustomers() {
        return customerService.getCustomers();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveCustomer(@RequestBody CustomerEntity customerEntity) {
        customerService.saveCustomer(customerEntity);
    }

    @PutMapping("/{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void editCustomer(
            @PathVariable Integer customerId,
            @RequestBody CustomerEntity customerEntity
    ) {
        customerService.editCustomer(customerId, customerEntity);
    }

    @GetMapping("/search")
    public List<CustomerEntity> getCustomer(@RequestParam(required = false) String firstName) {
        return customerService.findAll(firstName);
    }
}
