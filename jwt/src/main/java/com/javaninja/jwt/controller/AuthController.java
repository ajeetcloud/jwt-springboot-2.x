package com.javaninja.jwt.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @PostMapping("/authenticate")
    public String authenticate() {
        return "authenticated";
    }
}
