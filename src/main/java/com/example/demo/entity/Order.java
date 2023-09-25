package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor(force = true)
@Table(name = "order")
public class Order {
    @Id
    @Column(name = "order_id")
    private final UUID orderId;
    @Column(name = "created_at")
    private final LocalDateTime createdAt;
    @Column(name = "client_info")
    private final String clientInfo;
    @Column(name = "courier_info")
    private final String courierInfo;
    @Column(name = "delivery_address")
    private final String deliveryAddress;

    @Column(name = "delivery_time")
    private final LocalDateTime deliveryTime;

    @Column(name = "order_list")
    private final String orderList;

    public Order(UUID orderId,
                 LocalDateTime createdAt,
                 String clientInfo,
                 String courierInfo,
                 String deliveryAddress,
                 LocalDateTime deliveryTime,
                 String orderList) {
        this.orderId = orderId;
        this.createdAt = createdAt;
        this.clientInfo = clientInfo;
        this.courierInfo = courierInfo;
        this.deliveryAddress = deliveryAddress;
        this.deliveryTime = deliveryTime;
        this.orderList = orderList;
    }
}