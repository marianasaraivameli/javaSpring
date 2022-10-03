package com.example.poospring01.aula03.aulaAoVivo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Comparator;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Veiculo  implements Comparable<Veiculo> {
    private String placa;
    private String modelo;
    private int ano;
    private double valor;

    @Override
    public int compareTo(Veiculo other) {
        if(this.getValor() == other.getValor()) {
            return 0;
        }
        if (this.getValor() < other.getValor()) {
            return -1;
        }
        return 1;
    }
}
