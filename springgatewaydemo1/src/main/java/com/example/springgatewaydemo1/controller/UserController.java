package com.example.springgatewaydemo1.controller;


import com.example.springgatewaydemo1.entity.User;
import com.example.springgatewaydemo1.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    public UserServiceImpl userService;

    @GetMapping("/")
    public String welcome(){
        return "welcome to user service";
    }

    @PostMapping("/save")
    public ResponseEntity<User> saveUser(@RequestBody User user){
        User savedUser = userService.saveUser(user);
        return ResponseEntity.ok(savedUser);
    }

    @GetMapping("/getAll")
    public List<User> getAllUsers(){
        return userService.getAll();

    }
}
