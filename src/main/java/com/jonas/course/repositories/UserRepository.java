package com.jonas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonas.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
