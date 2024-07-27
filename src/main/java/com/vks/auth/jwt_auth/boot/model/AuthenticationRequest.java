package com.vks.auth.jwt_auth.boot.model;

public class AuthenticationRequest {

    private String username;

    private String password;

    public AuthenticationRequest() {

    }

    public AuthenticationRequest(String username, String password) {

        this.username = username;

        this.password = password;

        System.out.println("authRequest called..............");

    }

    public String getUsername() {

        return username;

    }

    public void setUsername(String username) {

        this.username = username;

    }

    public String getPassword() {

        return password;

    }

    public void setPassword(String password) {

        this.password = password;

    }

}