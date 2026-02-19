package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    // API 1: GET USERS
    @GetMapping
    public List<User> getUsers() {

        return userService.getAllUsers();
    }

    // API 2: CREATE USER
    @PostMapping
    public User createUser(@RequestBody User user) {

        return userService.createUser(user);
    }
}

