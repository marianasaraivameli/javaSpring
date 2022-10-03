package com.example.poospring01.aula02.praticaIntegradora.springJava;

import lombok.Data;

@Data
public class SintomaDTO {
    private String nome;
    private int nivelDeGravidade;

    public SintomaDTO(Sintoma sintoma) {
        this.nome = sintoma.getNome();
        this.nivelDeGravidade = sintoma.getNivelDeGravidade();
    }
}
