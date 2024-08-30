package com.sparta.memo.repository;

import com.sparta.memo.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long> {
    // findBy컬럼명OrderBy컬럼명Desc
    // a = A테이블 findBy컬럼LeftJoin
    // b = B테이블 findBy컬럼
    // a + b;
    List<Memo> findAllByOrderByModifiedAtDesc();
}