package com.matrix.example.demo.controller.mvc;

import com.matrix.example.demo.dao.entity.CustomerEntity;
import com.matrix.example.demo.mapper.CustomerMapper;
import com.matrix.example.demo.model.CustomerDto;
import com.matrix.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/company")
public class CompanyCustomerMvcController {
    private final CustomerService customerService;

    public CompanyCustomerMvcController(@Qualifier("companyCustomerServiceImpl") CustomerService customerService) {
        this.customerService = customerService;
    }

//    @GetMapping()
//    public String getCustomers (Model model){
//
//        model.addAttribute("company",customerService.getCustomers());
//        return "company-customersAjax";
//
//
//
//    }

    @GetMapping("/{id}")
    public String getCustomersById(Model model, @PathVariable Integer id){

        model.addAttribute("company",customerService.getCustomerById(id));
        return "customer-detail";
    }
    @PostMapping("/asa")
    public String addCompanyCustomers (@RequestBody CustomerEntity customerEntity){
        customerService.saveCustomer(customerEntity);
//        return customerEntity;
        return "success";
    }
    @GetMapping("/asa")
    public String getCustomers (){
        return "company-customersAjax";

    }


    }
