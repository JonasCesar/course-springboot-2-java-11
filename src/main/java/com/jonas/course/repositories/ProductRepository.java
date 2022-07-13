package com.jonas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonas.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
