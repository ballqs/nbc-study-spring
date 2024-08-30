package com.sparta.jpacascade.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    // OneToMay는 fetch의 기본값이 FetchType.LAZY(지연) 이다.
    @OneToMany(mappedBy = "user" , cascade = {CascadeType.PERSIST , CascadeType.REMOVE})
    private List<Food> foodList = new ArrayList<>();

    public void addFoodList(Food food) {
        this.foodList.add(food);
        food.setUser(this);
    }
}