package com.standard.sparta.service;

import com.standard.sparta.domain.Member;
import com.standard.sparta.dto.MemberCreateRequestDto;

public class MemberService {

    /**
     * 회원 생성 서비스.
     *
     * @param data 회원 생성 데이터를 담은 DTO 객체
     */
    public void createMember(MemberCreateRequestDto data) {
        log.info("::: - MemberService - createMember() :::");
        // 엔티티 조합
        Member newMember = Member.createNewMember(data.getEmail(), data.getName());

        // 회원 저장
        Member savedMember = memberRepository.save(newMember);
    }
}