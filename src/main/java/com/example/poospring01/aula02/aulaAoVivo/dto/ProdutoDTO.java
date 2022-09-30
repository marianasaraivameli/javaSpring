package com.example.poospring01.aula02.aulaAoVivo.dto;

import com.example.poospring01.aula02.aulaAoVivo.model.Produto;
import lombok.Data;

@Data
public class ProdutoDTO {
    private String nome;
    private double valor;

    public ProdutoDTO(Produto produto) {
        this.nome = getNome();
        this.valor = getValor();

    }
}
