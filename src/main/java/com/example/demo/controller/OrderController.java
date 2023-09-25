package com.example.demo.controller;

import com.example.demo.dto.mapper.OrderDtoMapper;
import com.example.demo.dto.rest.CreateOrderDto;
import com.example.demo.dto.rest.OrderDto;
import com.example.demo.entity.Order;
import com.example.demo.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/{id}")
    public OrderDto getOrder(@PathVariable(name = "id") UUID orderId) {
        return orderService.getById(orderId, OrderDtoMapper::toOrderDto);
    }

    @GetMapping
    public Iterable<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @PostMapping
    public Order createOrder(@RequestBody CreateOrderDto dto) {
        return orderService.createOrder(dto);
    }
}
