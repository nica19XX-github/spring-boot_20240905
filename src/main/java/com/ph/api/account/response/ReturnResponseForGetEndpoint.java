package com.ph.api.account.response;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ReturnResponseForGetEndpoint<T> {

    private T data;
    private int transactionStatusCode;
    private String transactionStatusDescription;

    public ReturnResponseForGetEndpoint(T data, int transactionStatusCode, String transactionStatusDescription) {
        this.data = data;
        this.transactionStatusCode = transactionStatusCode;
        this.transactionStatusDescription = transactionStatusDescription;
    }
}