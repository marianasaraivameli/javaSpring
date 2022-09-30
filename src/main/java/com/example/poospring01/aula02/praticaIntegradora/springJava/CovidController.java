package com.example.poospring01.aula02.praticaIntegradora.springJava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("findSymptom")
public class CovidController extends AppCovid{

    @GetMapping
    public void findSintomas() {

    }
}
