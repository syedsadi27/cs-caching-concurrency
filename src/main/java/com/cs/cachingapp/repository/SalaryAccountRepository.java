package com.cs.cachingapp.repository;

import com.cs.cachingapp.entity.SalaryAccount;
import org.springframework.data.repository.CrudRepository;

public interface SalaryAccountRepository extends CrudRepository<SalaryAccount, Long> {
}
