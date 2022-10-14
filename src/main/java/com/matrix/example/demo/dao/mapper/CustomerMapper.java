package com.matrix.example.demo.dao.mapper;


import com.matrix.example.demo.dao.entity.CustomerEntity;
import com.matrix.example.demo.dao.model.CustomerDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.web.bind.annotation.Mapping;

import java.time.LocalDate;

@Mapper
public abstract class CustomerMapper {
    public static final CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);


    public abstract CustomerDto mapToDto(CustomerEntity customerEntity);
}
