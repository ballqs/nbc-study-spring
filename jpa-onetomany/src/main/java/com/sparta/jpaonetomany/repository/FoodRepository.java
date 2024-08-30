package com.sparta.jpaonetomany.repository;

import com.sparta.jpaonetomany.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
