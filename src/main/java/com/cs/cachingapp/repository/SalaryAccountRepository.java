package com.cs.cachingapp.repository;

import com.cs.cachingapp.entity.SalaryAccount;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface SalaryAccountRepository extends CrudRepository<SalaryAccount, Long> {

    @Override
    @Lock(LockModeType.OPTIMISTIC)
    Optional<SalaryAccount> findById(Long id);

}
