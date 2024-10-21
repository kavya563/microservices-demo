package com.example.springgatewaydemo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")
public class Department {

    @GetMapping("/")
    public String welcome(){
        return "welcome to user service";
    }
}
