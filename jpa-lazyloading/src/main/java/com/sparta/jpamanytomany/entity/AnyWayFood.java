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
//@Table(name = "food")
//public class AnyWayFood {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String name;
//    private double price;
//
//    @ManyToMany
//    @JoinTable(name = "orders", // 중간 테이블 생성
//            joinColumns = @JoinColumn(name = "food_id"), // 현재 위치인 Food Entity 에서 중간 테이블로 조인할 컬럼 설정
//            inverseJoinColumns = @JoinColumn(name = "user_id")) // 반대 위치인 User Entity 에서 중간 테이블로 조인할 컬럼 설정
//    private List<AnyWayUser> anyWayUser = new ArrayList<>();
//
//    public void addUserList(AnyWayUser anyWayUser) {
//        this.anyWayUser.add(anyWayUser); // 외래 키(연관 관계) 설정
//        anyWayUser.getFoodList().add(this);
//    }
//}