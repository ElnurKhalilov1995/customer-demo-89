package com.matrix.example.demo.model.repository;

import com.matrix.example.demo.dao.entity.CustomerEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerEntity, Integer> {

    @Query(value = "select c from CustomerEntity c where c.firstName = :firstName")
    List<CustomerEntity> findAll(String firstName);
}
