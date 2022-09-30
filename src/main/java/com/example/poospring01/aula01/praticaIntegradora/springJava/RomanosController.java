package com.example.poospring01.aula01.praticaIntegradora.springJava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/romanos")
public class RomanosController extends NumerosRomanos{

    @GetMapping("/{numero}")
    public String transformaNumeroEmRomano(@PathVariable int numero) {
        return converterEmRomanos(numero);
    }

}
