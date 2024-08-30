//package com.sparta.jpamanytomany.entity;
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Getter
//@Setter
//@Table(name = "users")
//public class AnyWayUser {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String name;
//
//    @ManyToMany(mappedBy = "userList")
//    private List<AnyWayFood> foodList = new ArrayList<>();
//
//    public void addFoodList(AnyWayFood anyWayFood) {
//        this.foodList.add(anyWayFood);
//        anyWayFood.getUserList().add(this); // 외래 키(연관 관계) 설정
//    }
//}