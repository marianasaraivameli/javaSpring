package com.example.poospring01.aula02.praticaIntegradora.springJava;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {
    private String id;
    private String nome;
    private String sobrenome;
    private int idade;
}
