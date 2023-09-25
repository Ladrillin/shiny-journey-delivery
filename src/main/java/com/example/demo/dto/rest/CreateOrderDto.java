package com.example.demo.dto.rest;

import java.util.UUID;

public record CreateOrderDto(String clientInfo,
                             String deliveryAddress,
                             String orderList) {

}
