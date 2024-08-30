package com.sparta.jpaonetoone.repository;

import com.sparta.jpaonetoone.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
