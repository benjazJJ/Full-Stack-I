package com.holamundo.holamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class holamundocontroller {
    @GetMapping("/hola")
    public String holamundo(){
        return"Hola mundo!!";
    }
}
