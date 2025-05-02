package com.code.FeedbackPortalAPI.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity
public class SecurityConfig {

    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http

                .authorizeHttpRequests(auth -> auth
                // allowed to access the register and login
                        .requestMatchers("/auth/register", "/auth/login", "/").permitAll()
                        .anyRequest().authenticated()
                );

        return http.build();
    }
}