package com.embarkx.ecommerce.payload;

import lombok.Data;

@Data
public class StripePaymentDto {
    private Long amount;
    private String currency;
}
