//package com.sparta.springauth.config;
//
//import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity // Spring Security 지원을 가능하게 함
//public class WebSecurityConfig2 {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        // CSRF 설정(disable 처리했기에 사용하지 않는다는 것)
//        http.csrf((csrf) -> csrf.disable());
//
//        http.authorizeHttpRequests((authorizeHttpRequests) ->
//                authorizeHttpRequests
//                        .requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll() // resources 접근 허용 설정(static에는 접근 허용)
//                        .requestMatchers("/api/user/**").permitAll()  // 이 설정 덕분에 해당 URL로 들어오는 것은 security에 안걸림
////                        .requestMatchers("/api/user/**").hasRole("ADMIN")   // 해당 URL은 ADMIN 권한을 가진 사람만 접근 가능
//                        .anyRequest().authenticated() // 그 외 모든 요청 인증처리
//        );
//
//        // 로그인 사용
//        // http.formLogin(Customizer.withDefaults());
//        http.formLogin((formLogin) ->
//                formLogin
//                    // 로그인 View 제공 (GET /api/user/login-page)
//                    .loginPage("/api/user/login-page")
//                    // 로그인 처리 (POST /api/user/login)
//                    .loginProcessingUrl("/api/user/login")
//                    // 로그인 처리 후 성공시 URL
//                    .defaultSuccessUrl("/")
//                    // 로그인 처리 후 실패시 URL
//                    .failureUrl("/api/user/login-page?error")
//                    .permitAll()
//        );
//
//        return http.build();
//    }
//}
//
