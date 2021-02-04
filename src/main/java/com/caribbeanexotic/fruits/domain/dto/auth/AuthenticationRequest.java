package com.caribbeanexotic.fruits.domain.dto.auth;

import lombok.Data;

@Data
public class AuthenticationRequest {
    private String user;
    private String password;
}
