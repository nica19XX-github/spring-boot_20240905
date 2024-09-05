package com.ph.api.account.service.impl;

import com.ph.api.account.entity.CustomerAccount;
import com.ph.api.account.dto.CustomerAccountDto;
import com.ph.api.account.exception.ResourceNotFoundException;
import com.ph.api.account.repository.CustomerAccountRepository;
import com.ph.api.account.service.CustomerAccountService;
import com.ph.api.account.mapper.CustomerAccountMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerAccountServiceImpl implements CustomerAccountService {
    private CustomerAccountRepository customerAccountRepository;

    @Override
    public CustomerAccountDto createCustomerAccount (CustomerAccountDto customerAccountDto) {

        CustomerAccount account = CustomerAccountMapper.mapToCustomerAccount(customerAccountDto);
        CustomerAccount saveCustomerAccount = customerAccountRepository.save(account);
        return CustomerAccountMapper.mapToCustomerAccountDto(saveCustomerAccount);
    }

    @Override
    public CustomerAccountDto getCustomerAccountById(Long customerAccountById) {
        CustomerAccount account =  customerAccountRepository.findById(customerAccountById)
                .orElseThrow(()-> new ResourceNotFoundException("Customer Account not found with customer number: " + customerAccountById));
        return CustomerAccountMapper.mapToCustomerAccountDto(account);
    }
}
