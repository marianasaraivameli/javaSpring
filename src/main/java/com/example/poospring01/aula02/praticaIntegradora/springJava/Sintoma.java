package com.example.poospring01.aula02.praticaIntegradora.springJava;

public class Sintoma {
    private String codigo;
    private String nome;
    private int nivelDeGravidade;

    public Sintoma(String codigo, String nome, int nivelDeGravidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.nivelDeGravidade = nivelDeGravidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getNivelDeGravidade() {
        return nivelDeGravidade;
    }

    @Override
    public String toString() {
        return "codigo sintoma='" + codigo + '\'' +
                ", sintoma='" + nome + '\'' +
                ", nivel de Gravidade=" + nivelDeGravidade;
    }
}
