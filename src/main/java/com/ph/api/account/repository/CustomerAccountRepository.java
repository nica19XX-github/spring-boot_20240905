package com.ph.api.account.repository;

import com.ph.api.account.entity.CustomerAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerAccountRepository extends JpaRepository<CustomerAccount, Long> {
}
