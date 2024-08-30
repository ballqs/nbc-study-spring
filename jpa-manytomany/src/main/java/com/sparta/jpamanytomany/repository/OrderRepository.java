package com.sparta.jpamanytomany.repository;

import com.sparta.jpamanytomany.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
