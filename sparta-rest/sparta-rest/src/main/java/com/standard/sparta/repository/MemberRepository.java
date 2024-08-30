package com.standard.sparta.repository;

import com.standard.sparta.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
    // 생산성 향상 : 대부분의 기본적인 데이터 접근 로직 이미 구현
    // 유연성 부족 : JPA의 기본 동작을 변경하거나 세밀한 제어가 어려움
    @Query("SELECT m FROM Member m JOIN FETCH m.course")
    List<Member> findAllWithFetchJoin();
}
