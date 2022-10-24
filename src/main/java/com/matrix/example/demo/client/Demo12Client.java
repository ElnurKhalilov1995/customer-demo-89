package com.matrix.example.demo.client;

import com.matrix.example.demo.client.model.CustomerDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(
        name = "demo-12-client",
        url = "http://localhost:8081/main"
)
public interface Demo12Client {
    @GetMapping("/customers")
    List<CustomerDto> getCustomerList();
}
