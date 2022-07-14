package com.jonas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonas.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
