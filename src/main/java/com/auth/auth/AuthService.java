package com.auth.auth;


public interface AuthService {
    public AuthDto getAuthById(String id);
    public AuthDto createAuth(AuthDto productDto);
    public AuthDto deleteAuth(String login);
    public AuthDto updateAuth(AuthDto AuthDto);
    public AuthDto getAuthByLogin(String login);


}



