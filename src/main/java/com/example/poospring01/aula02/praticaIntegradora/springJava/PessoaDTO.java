package com.example.poospring01.aula02.praticaIntegradora.springJava;

import lombok.Data;

@Data
public class PessoaDTO {

    private String nome;
    private String sobrenome;

    public PessoaDTO(Pessoa pessoa) {
        this.nome = pessoa.getNome();
        this.sobrenome = pessoa.getSobrenome();
    }
}
