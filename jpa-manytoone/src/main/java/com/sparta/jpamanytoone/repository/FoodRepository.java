package com.sparta.jpamanytoone.repository;

import com.sparta.jpamanytoone.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
