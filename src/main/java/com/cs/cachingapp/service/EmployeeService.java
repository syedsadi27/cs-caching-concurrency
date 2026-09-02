package com.cs.cachingapp.service;

import com.cs.cachingapp.EmployeeDto;

public interface EmployeeService {

        EmployeeDto getEmployeeById(Long id);
        EmployeeDto createNewEmployee(EmployeeDto employeeDto);
        EmployeeDto updateEmployee(Long id, EmployeeDto employeeDto);
        void deleteEmployee(Long id);


}
