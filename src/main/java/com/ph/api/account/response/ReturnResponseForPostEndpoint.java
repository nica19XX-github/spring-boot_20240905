package com.ph.api.account.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ReturnResponseForPostEndpoint {

    private long customerNumber;
    private int transactionStatusCode;
    private String transactionStatusDescription;

    public ReturnResponseForPostEndpoint(long customerNumber, int transactionStatusCode, String transactionStatusDescription) {
        this.customerNumber = customerNumber;
        this.transactionStatusCode = transactionStatusCode;
        this.transactionStatusDescription = transactionStatusDescription;
    }
}