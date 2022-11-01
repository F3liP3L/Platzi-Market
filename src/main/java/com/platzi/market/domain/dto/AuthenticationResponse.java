package com.platzi.market.domain.dto;

public class AuthenticationResponse {

    private String jws;

    public AuthenticationResponse(String jws) {
        this.jws = jws;
    }

    public String getJws() {
        return jws;
    }

    public void setJws(String jws) {
        this.jws = jws;
    }
}
