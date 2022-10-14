package com.matrix.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@Builder
@Data
public class CustomerDto {
    private String name;
    private String surname;
    private Integer age;
//    @JsonProperty("birthdate")
    private LocalDate birthDate;
}
