package com.sparta.springmvc.html;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

    private static long visitCount = 0;

    @GetMapping("/static-hello")
    public String hello() {
        // 라우팅 방식이 아닌 url에 해당하는 파일을 찾아서 가져옴
        // Mapping이랑 관계 없음!
        // 예를 들어서 http://localhost:9090/hello.html 이라고 하면
        // static 안에 있는 hello.html를 찾아서 뿌림

        // thyleaf가 걸려있지 않은 상황에서 mapping를 통해 static에 접근할수도 있다.

        return "hello.html";
    }

    @GetMapping("/html/redirect")
    public String htmlStatic() {
        // Status Code 302로 나오면 redirect로 통해 요청되어온 것
        return "redirect:/hello.html";
    }

    @GetMapping("/html/templates")
    public String htmlTemplates() {
        // thyleaf를 사용하면 hello 뒤에 .html를 붙일 필요가 없다.
        // 있다고 판단해서 찾아준다.
        return "hello";
    }

    @GetMapping("/html/dynamic")
    public String htmlDynamic(Model model) {
        model.addAttribute("visits" , ++visitCount);
        return "hello-visit";
    }
}
