package com.ph.api.account.service;

import com.ph.api.account.dto.CustomerAccountDto;

public interface CustomerAccountService {

    CustomerAccountDto createCustomerAccount(CustomerAccountDto customerAccountDto);
    CustomerAccountDto getCustomerAccountById(Long customerAccountById);
}
