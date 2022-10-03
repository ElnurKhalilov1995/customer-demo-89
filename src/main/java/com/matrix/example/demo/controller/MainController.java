package com.matrix.example.demo.controller;


import com.matrix.example.demo.config.Operations;
import com.matrix.example.demo.model.CustomerDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/main")
public class MainController {
    private final Operations operations;

    public MainController(Operations operations) {
        this.operations = operations;
    }

    @GetMapping("/hello/{name}/test")
    public String hello(
            @PathVariable String name,
            @RequestParam int age
    ) {
        return "HELLO " + name + "! I am " + age;
    }

    @GetMapping("/hi")
    public String hi() {
        return "HI!";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void addCustomer(@RequestBody CustomerDto customerDto) {
        System.out.println(customerDto);
    }
}
