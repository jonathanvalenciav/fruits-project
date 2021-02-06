package com.caribbeanexotic.fruits.domain.dto.auth;

import lombok.Data;

@Data
public class AuthenticationResponse {

    public AuthenticationResponse(String jwt){
        this.jwt = jwt;
    }
    private String jwt;
}
