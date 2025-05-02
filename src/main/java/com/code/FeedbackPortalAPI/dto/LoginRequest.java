package com.code.FeedbackPortalAPI.dto;

import lombok.Getter;
import lombok.Setter;

// DTO for Login request
@Getter
@Setter
public class LoginRequest {
    private String username;
    private String password;
}