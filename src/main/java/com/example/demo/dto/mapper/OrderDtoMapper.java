package com.example.demo.dto.mapper;

import com.example.demo.dto.rest.OrderDto;
import com.example.demo.entity.Order;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class OrderDtoMapper {

    public static OrderDto toOrderDto(Order order) {
        return new OrderDto(
                order.getOrderId(),
                order.getCreatedAt(),
                order.getClientInfo(),
                order.getCourierInfo(),
                order.getDeliveryAddress(),
                order.getDeliveryTime(),
                order.getOrderList()
        );
    }
}
