package com.sparta.springauth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class PasswordConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        // Hash 함수 비밀번호를 암호화해줌
        // 해당 메서드를 사용해서 비밀번호를 encoding하는 것
        return new BCryptPasswordEncoder();
    }
}