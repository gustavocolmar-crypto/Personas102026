package com.example.personas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerHolaMundo {

    @GetMapping("/holas")
    public String holaMundo(){
        return "holaMundo";
    }

    @GetMapping("/otros")
    public String hola2(){
        return "hola2";
    }

    @GetMapping("/pruebaGit3")
    public String prueba(){
        return "commit desde git";
    }

}
