package com.example.poospring01.aula01.praticaIntegradora.springJava02;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/codigomorse")
public class CodigoMorseController extends CodigoMorse {

    @GetMapping("/{codigo}")
    public String decodificandoCodigoMorse(@PathVariable String codigo) {
        return codigoMorseDecodificado(codigo);
    }
}
