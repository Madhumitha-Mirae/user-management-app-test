package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // GET all users
    public List<User> getAllUsers() {

        return userRepository.findAll();
    }

    // CREATE user
    public User createUser(User user) {

        return userRepository.save(user);
    }
}

