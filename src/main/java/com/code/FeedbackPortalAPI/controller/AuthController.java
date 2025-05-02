package com.code.FeedbackPortalAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @GetMapping("/register")
    public String register() {
        return "Register success";
    }

    @GetMapping("/login")
    public String login() {
        return "Login success";
    }


}