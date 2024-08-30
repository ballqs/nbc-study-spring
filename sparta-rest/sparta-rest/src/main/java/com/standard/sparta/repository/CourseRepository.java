package com.standard.sparta.repository;

import com.standard.sparta.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    @Query("SELECT c FROM Course c JOIN FETCH c.members")
    List<Course> findAllWithFetchJoin();
}
