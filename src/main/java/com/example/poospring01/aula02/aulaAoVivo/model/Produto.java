package com.example.poospring01.aula02.aulaAoVivo.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// lombok
@Getter // gerar o getter de todos os elementos automaticamente
@Setter // gerar o setter de todos os elemtentos automaticamente
@AllArgsConstructor //  gerar o construtor com todos os argumentos

public class Produto {
    private int id;
    private String nome;
    private double valor;
}
