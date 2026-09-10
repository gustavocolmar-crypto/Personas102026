package com.example.personas.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class MundoDeholas {

    @GetMapping("/nuevo")
    public String holaMundo(){
        return "holaMundo";
    }
}
