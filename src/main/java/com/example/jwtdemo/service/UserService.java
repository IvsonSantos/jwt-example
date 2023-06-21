package com.example.jwtdemo.service;

import com.example.jwtdemo.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public void saveUser(User user);

    public User getUserByNameAndPassword(String name, String password) throws UserNotFoundException;
}
