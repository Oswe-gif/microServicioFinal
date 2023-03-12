package com.example.ordermicroservice.controller.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDTO {

    private String productId;
    private String customerId;
    private String sellerId;

    @Override
    public String toString() {
        return "";
    }
}
