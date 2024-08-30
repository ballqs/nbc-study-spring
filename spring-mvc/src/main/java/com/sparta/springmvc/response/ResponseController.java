package com.sparta.springmvc.response;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController     // RestController를 사용하면 ResponseBody가 필요없어짐
@RequestMapping("/response")
public class ResponseController {
    @GetMapping("/json/string")
    public String helloStringJson() {
        // Content-Type : text/html
        // Response Body
        // {"name":"Robbie","age":95}
        return "{\"name\":\"Robbie\",\"age\":95}";
    }

    @GetMapping("/json/class")
    public Star helloClassJson() {
        // ctrl + e 를 누르면 이전에 작업하면 파일 목록 확인

        // Content-Type : application/json
        // Response Body
        // {"name":"Star","age":50}
        return new Star("Star" , 50);
    }
}
