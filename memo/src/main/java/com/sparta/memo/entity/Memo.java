package com.sparta.memo.entity;

import com.sparta.memo.dto.MemoRequestDto;
import lombok.*;

@Data
@Getter                     // 중요
@Setter
@NoArgsConstructor          // 중요
@AllArgsConstructor
@ToString
public class Memo {
    private Long id;
    private String username;
    private String contents;

    public Memo(MemoRequestDto requestDto) {
        this.username = requestDto.getUsername();
        this.contents = requestDto.getContents();
    }

    public void update(MemoRequestDto memoRequestDto) {
        this.username = memoRequestDto.getUsername();
        this.contents = memoRequestDto.getContents();
    }
}

// Map에 객체 있는걸 바로 객체로 받아서 바꾸는 것은 미친짓
// 그래서 이것을 빼내기 위한 방법은 새로운 Map를 받아서 리턴하는 방향 지향

// dto의 역할 => 레이어간의 데이터를 안전하게 운반해주는 책임을 가진 애
// dto가 불변해야하는 이유 데이터 일관성을 유지하기위해

// stream().filter().map().toList();
// List<Integer> list = List.of(1,2,3,4,5) 로 생성한것에는 add() 불가