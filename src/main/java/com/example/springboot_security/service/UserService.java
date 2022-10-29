package com.example.springboot_security.service;

import com.example.springboot_security.model.User;

import java.util.List;

public interface UserService {
    User save(User user);
    User findByUsername(String username);
    List<User> findAll();
}
