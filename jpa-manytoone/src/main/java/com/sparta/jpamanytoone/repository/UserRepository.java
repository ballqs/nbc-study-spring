package com.sparta.jpamanytoone.repository;

import com.sparta.jpamanytoone.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
