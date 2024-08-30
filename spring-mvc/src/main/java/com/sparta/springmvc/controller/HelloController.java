package com.sparta.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api")
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/get")
    @ResponseBody
    public String get() {
        return "GET Method 요청";
    }

    @PostMapping("/post")
    @ResponseBody
    public String post() {
        return "POST Method 요청!";
    }

    @PutMapping("/put")
    @ResponseBody
    public String put() {
        return "PUT Method 요청!";
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public String delete() {
        return "DELETE Method 요청!";
    }

    @PatchMapping("/patch")
    @ResponseBody
    public String patch() {
        return "PATCH Method 요청!";
    }
}
