package com.example.poospring01.aula03.aulaAoVivo.dto;


import com.example.poospring01.aula03.aulaAoVivo.model.Veiculo;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class VeiculoDTO implements Serializable {
    private String placa;
    private String modelo;

    public VeiculoDTO(Veiculo veiculo) {
        this.placa = veiculo.getPlaca();
        this.modelo= veiculo.getModelo();
    }
}
