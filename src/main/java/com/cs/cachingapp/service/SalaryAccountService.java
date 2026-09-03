package com.cs.cachingapp.service;

import com.cs.cachingapp.entity.Employee;
import com.cs.cachingapp.entity.SalaryAccount;

public interface SalaryAccountService {
    void createAccount(Employee employee);

    SalaryAccount incrementBalance(Long accountId);
}
