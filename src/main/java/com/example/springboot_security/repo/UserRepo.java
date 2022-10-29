package com.example.springboot_security.repo;

import com.example.springboot_security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
    User save(User user);
    User findByUsername(String username);
    List<User> findAll();
}
