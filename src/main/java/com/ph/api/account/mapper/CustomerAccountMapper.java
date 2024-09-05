package com.ph.api.account.mapper;

import com.ph.api.account.dto.CustomerAccountDto;
import com.ph.api.account.entity.CustomerAccount;

public class CustomerAccountMapper {

    public static CustomerAccountDto mapToCustomerAccountDto(CustomerAccount customerAccount) {

        return new CustomerAccountDto(
                customerAccount.getCustomerNumber(),
                customerAccount.getCustomerName(),
                customerAccount.getCustomerMobile(),
                customerAccount.getCustomerEmail(),
                customerAccount.getAddress1(),
                customerAccount.getAddress2()
        );
    }

    public static CustomerAccount mapToCustomerAccount(CustomerAccountDto customerAccountDto) {

        return new CustomerAccount(
                customerAccountDto.getCustomerNumber(),
                customerAccountDto.getCustomerName(),
                customerAccountDto.getCustomerMobile(),
                customerAccountDto.getCustomerEmail(),
                customerAccountDto.getAddress1(),
                customerAccountDto.getAddress2()
        );
    }
}
