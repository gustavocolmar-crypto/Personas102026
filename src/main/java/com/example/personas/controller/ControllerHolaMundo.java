package com.example.personas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerHolaMundo {

    @GetMapping("/hola")
    public String holaMundo(){
        return "holaMundo";
    }

    @GetMapping("/otro")
    public String hola2(){
        return "hola2";
    }

}
