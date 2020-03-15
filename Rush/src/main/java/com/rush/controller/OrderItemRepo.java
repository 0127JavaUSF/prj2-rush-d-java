package com.rush.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rush.model.OrderItem;

public interface OrderItemRepo extends JpaRepository<OrderItem, Long> {

}
