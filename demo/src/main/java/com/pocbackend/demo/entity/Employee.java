package com.pocbackend.demo.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
@JsonSerialize(using = EmployeeSerializer.class)
public class Employee {

    private final String name;
    private final Date birthday;
    private final String email;
    private final String telephone;
    private final String country;
    private final String agent;
    private final String status;
    private final int activity;
    private final boolean verified;

}
