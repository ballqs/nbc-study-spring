package com.sparta.jpamanytomany.repository;

import com.sparta.jpamanytomany.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
