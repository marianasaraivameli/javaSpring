package com.example.poospring01.aula02.exemploProjeto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/informarURL")
public class ExemploController {

    @GetMapping
    public void testeController() {
        System.out.println("Exemplo simples de controller");
    }
}
