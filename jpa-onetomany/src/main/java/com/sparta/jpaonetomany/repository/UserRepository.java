package com.sparta.jpaonetomany.repository;

import com.sparta.jpaonetomany.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
