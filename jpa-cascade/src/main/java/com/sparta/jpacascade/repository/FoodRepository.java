package com.sparta.jpacascade.repository;

import com.sparta.jpacascade.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
