package com.sparta.jpaonetoone.repository;

import com.sparta.jpaonetoone.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
