package com.sparta.jpamanytomany.entity;

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
    @OneToMany(mappedBy = "user")
    private List<Food> foodList = new ArrayList<>();
}