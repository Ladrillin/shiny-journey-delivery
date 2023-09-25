package com.example.demo.repository;

import com.example.demo.entity.Order;
import jakarta.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
@Table(name = "order")
public interface OrderRepository extends JpaRepository<Order, UUID> {
}
