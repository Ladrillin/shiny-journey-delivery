package com.example.demo.dto.rest;

import java.time.LocalDateTime;
import java.util.UUID;

public record OrderDto(UUID orderId,
                       LocalDateTime createdAt,
                       String clientInfo,
                       String courierInfo,
                       String deliveryAddress,
                       LocalDateTime deliveryTime,
                       String orderList) {

}
