package com.example.springboot_security.service;

import com.example.springboot_security.model.User;
import com.example.springboot_security.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepo userRepo;

    @Override
    public User save(User user) {
        User apUser = userRepo.findByUsername(user.getUsername());
        User newUser = new User();
        if(apUser != null){
            newUser = userRepo.save(user);
        }
        return newUser;
    }

    @Override
    public User findByUsername(String username) {
        return userRepo.findByUsername(username);
    }

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }
}
