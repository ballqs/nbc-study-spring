package com.standard.sparta.controller;

import com.standard.sparta.dto.MemberCreateRequestDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/member")
public class MemberController {
    /**
     * 1. 회원 생성을 위한 뷰를 반환합니다.
     * @return view 이름 반환
     */
    @GetMapping("/create-form")
    public String createMemberView() {
        log.info("::: MemberController - createMemberView() :::");
        return "member-create-form";
    }

    /**
     * 1-1. 회원 생성 API
     * @return
     */
    @PostMapping()
    public String createMemberAPI(@ModelAttribute MemberCreateRequestDto request) {
        log.info("::: MemberController - createMemberAPI() :::");


        // 회원 생성 서비스 호출
        memberService.createMember(request);
        return "redirect:/member/list-form";
    }

}