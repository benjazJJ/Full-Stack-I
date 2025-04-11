package com.holamundo.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class holamundocontroller {

    @GetMapping("/hola")
    public String holaMundo(){
        return "Hola Mundo desde Spring Boot!";
    }
}
