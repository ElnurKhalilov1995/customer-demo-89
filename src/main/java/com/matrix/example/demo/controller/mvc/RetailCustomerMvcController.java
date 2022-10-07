package com.matrix.example.demo.controller.mvc;

import com.matrix.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customers")
public class RetailCustomerMvcController {
    private final CustomerService customerService;

    public RetailCustomerMvcController(
            @Qualifier("retailCustomerServiceImpl")
            CustomerService customerService
    ) {
        this.customerService = customerService;
    }

    @GetMapping
    public String getCustomers(Model model) {
        model.addAttribute("customers", customerService.getCustomers());
        model.addAttribute("text", "Hello World");
        return "customer-home-page";
    }

    @GetMapping("/{id}")
    public String getCustomerById(
            Model model,
            @PathVariable Integer id
    ) {
        model.addAttribute("customer", customerService.getCustomerById(id));
        return "customer-detail";
    }
}
