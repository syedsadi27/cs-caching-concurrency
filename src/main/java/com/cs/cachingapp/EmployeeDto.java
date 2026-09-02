package com.cs.cachingapp;

import lombok.Data;

@Data
public class EmployeeDto {
    private Long id;
    private String email;
    private String name;
    private Long salary;
}
