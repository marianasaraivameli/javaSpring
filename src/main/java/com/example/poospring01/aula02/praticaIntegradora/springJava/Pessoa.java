package com.example.poospring01.aula02.praticaIntegradora.springJava;

public class Pessoa {
    private String id;
    private String nome;
    private String sobrenome;
    private int idade;
    private Sintoma sintoma;

    public Pessoa(String id, String nome, String sobrenome, int idade, Sintoma sintoma) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.sintoma = sintoma;
    }

    @Override
    public String toString() {
        return  "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                ", " + sintoma;
    }
}
