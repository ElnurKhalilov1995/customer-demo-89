package com.matrix.example.demo.dao.model;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class CustomerDto {
    private Integer id;
    private String firstName;
    private String lastName;
    private int age;
}
