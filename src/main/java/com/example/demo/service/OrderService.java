package com.example.demo.service;

import com.example.demo.dto.rest.CreateOrderDto;
import com.example.demo.entity.Order;
import com.example.demo.exception.ValidationException;
import com.example.demo.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;
import java.util.function.Function;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public <O> O getById(UUID id, Function<Order, O> mapper) {
        return mapper.apply(getById(id));
    }
    public Order getById(UUID orderId) {
        return orderRepository.findById(orderId)
                .orElseThrow(() -> ValidationException.of("Order service", orderId, "Cannot find this order ID"));
    }

    public Iterable<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order createOrder(CreateOrderDto dto) {

        Order order = new Order(
                UUID.randomUUID(),
                LocalDateTime.now(),
                dto.clientInfo(),
                "Random courier",
                dto.deliveryAddress(),
                LocalDateTime.now().plusYears(100),
                dto.orderList()
        );

        return orderRepository.save(order);
    }
}
