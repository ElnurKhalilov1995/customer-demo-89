package com.matrix.example.demo.client.model;

public class CustomerDto {
    private String name;
    private String surname;
    private Integer age;
    private String customerDetail;

    public CustomerDto() {
    }

    public CustomerDto(String name, String surname, Integer age, String customerDetail) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.customerDetail = customerDetail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCustomerDetail() {
        return customerDetail;
    }

    public void setCustomerDetail(String customerDetail) {
        this.customerDetail = customerDetail;
    }
}
