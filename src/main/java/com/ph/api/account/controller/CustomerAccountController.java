package com.ph.api.account.controller;

import com.ph.api.account.response.ReturnResponseForGetEndpoint;
import jakarta.validation.Valid;
import com.ph.api.account.dto.CustomerAccountDto;
import com.ph.api.account.response.ReturnResponseForPostEndpoint;
import com.ph.api.account.service.CustomerAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@Validated
@RestController
@RequestMapping("/api/v1/account")
public class CustomerAccountController {

    @Autowired
    private CustomerAccountService customerAccountService;

    @PostMapping
    public ResponseEntity<ReturnResponseForPostEndpoint> createCustomerAccount(@Valid @RequestBody CustomerAccountDto customerAccountDto) {
        CustomerAccountDto savedCustomerAccount = customerAccountService.createCustomerAccount(customerAccountDto);
        long customerNumber = savedCustomerAccount.getCustomerNumber();
        ReturnResponseForPostEndpoint response = new ReturnResponseForPostEndpoint(
                customerNumber,
                HttpStatus.CREATED.value(),
                "Customer Account created");
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }


    @GetMapping("/{customerNumber}")
    public ResponseEntity<ReturnResponseForGetEndpoint<CustomerAccountDto>> getCustomerAccountById(@PathVariable Long customerNumber) {
        CustomerAccountDto customerAccountDto = customerAccountService.getCustomerAccountById(customerNumber);
        ReturnResponseForGetEndpoint<CustomerAccountDto> response = new ReturnResponseForGetEndpoint<>(
                customerAccountDto,
                HttpStatus.OK.value(),
                "Customer Account found"
        );
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
