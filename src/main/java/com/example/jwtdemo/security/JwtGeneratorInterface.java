package com.example.jwtdemo.security;

import com.example.jwtdemo.model.User;

import java.util.Map;

public interface JwtGeneratorInterface {

    Map<String, String> generateToken(User user);

}
