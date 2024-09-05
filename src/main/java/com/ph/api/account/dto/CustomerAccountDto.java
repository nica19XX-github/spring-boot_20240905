package com.ph.api.account.dto;

import jakarta.validation.constraints.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerAccountDto {

    private long customerNumber;

    @NotBlank(message = "Invalid Customer Name: customerName field is EMPTY.")
    @NotNull(message = "Invalid Customer Name: customerName field is NULL.")
    private String customerName;

    @NotBlank(message = "Invalid Mobile Number: customerMobile field is EMPTY.")
    @NotNull(message = "Invalid Mobile Number: customerMobile field is NULL.")
    @Pattern(regexp = "^\\d{11}$", message = "Invalid Mobile Number.")
    private String customerMobile;

    @NotEmpty(message = "Email is required field.")
    @Email(message = "Invalid Email Address", flags = { Pattern.Flag.CASE_INSENSITIVE })
    private String customerEmail;

    @NotBlank(message = "Invalid Address: address1 field is EMPTY.")
    @NotNull(message = "Invalid Address: address1 field is NULL.")
    private String address1;

    private String address2;

}