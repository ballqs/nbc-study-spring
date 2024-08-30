package com.sparta.jpamanytomany.repository;

import com.sparta.jpamanytomany.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
