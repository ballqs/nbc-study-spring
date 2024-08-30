package com.example.springprepare;

import lombok.*;

//@AllArgsConstructor       // 모든 멤버변수가 있는 생성자
//@NoArgsConstructor        // 멤버변수 없는 생성자
@RequiredArgsConstructor    // final인 멤버변수만 있는 생성자
@Getter     // getter 자동 생성
@Setter     // setter 자동 생성
public class Memo {
    private final String username;
    private String contents;

}

class Main {
    public static void main(String[] args) {
        Memo memo = new Memo("");
//        Memo memo2 = new Memo();

        memo.getContents();
        memo.getUsername();
    }
}