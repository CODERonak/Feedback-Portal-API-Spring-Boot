package com.code.FeedbackPortalAPI.dto;

import lombok.Data;

// DTO for Login request
@Data
public class LoginRequest {
    private String username;
    private String password;
}