package com.code.FeedbackPortalAPI.dto;

import lombok.Data;

// DTO for registration request
@Data
public class RegistrationRequest {
    private String username;
    private String password;
}