package com.atharva.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atharva.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
