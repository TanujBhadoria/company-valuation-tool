package com.tanuj.valuation_tool.dto;

public class AuthResponse {
    private String token;

    public AuthResponse(String token){
        this.token = token;
    }

    public String getToken() { return token; }
    public void setToken(String token){
         this.token = token;
    }
}
