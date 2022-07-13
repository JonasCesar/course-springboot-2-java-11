package com.jonas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonas.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
