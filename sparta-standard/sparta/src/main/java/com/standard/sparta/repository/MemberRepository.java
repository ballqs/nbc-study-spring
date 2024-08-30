package com.standard.sparta.repository;

public interface MemberRepository {
    Member save(Member member);

    Member findById(Long memberId);

    List<Member> findAll();

    Member update(MemberUpdateRequestDto data);

    Member delete(MemberDeleteRequestDto data);
}