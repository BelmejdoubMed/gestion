package com.example.gestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gestion.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {}
