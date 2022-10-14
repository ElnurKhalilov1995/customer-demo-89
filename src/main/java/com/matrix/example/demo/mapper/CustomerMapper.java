package com.matrix.example.demo.mapper;

import com.matrix.example.demo.dao.entity.CustomerEntity;
import com.matrix.example.demo.model.CustomerDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.time.LocalDate;

@Mapper
public abstract class CustomerMapper {

    public static final CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);
//    @Mapping(source = "firstName",target = "name")
//    @Mapping(source = "lastName",target = "surname")
//    @Mapping(source = "age",target = "")
//    public abstract CustomerDto mapToDto(CustomerEntity customerEntity);

    public CustomerDto mapToDto(CustomerEntity customerEntity){
        return CustomerDto.builder().name(customerEntity.getFirstName()).surname(customerEntity.getLastName()).age(customerEntity.getAge()).birthDate(LocalDate.now().minusYears(customerEntity.getAge())).build();
    }
}
