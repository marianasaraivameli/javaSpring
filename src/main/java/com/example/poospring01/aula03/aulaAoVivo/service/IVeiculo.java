package com.example.poospring01.aula03.aulaAoVivo.service;

import com.example.poospring01.aula03.aulaAoVivo.dto.VeiculoDTO;
import com.example.poospring01.aula03.aulaAoVivo.exception.NotFoundException;
import com.example.poospring01.aula03.aulaAoVivo.model.Veiculo;

import java.util.List;

public interface IVeiculo {
    Veiculo getVeiculo(String placa) throws NotFoundException;
    List<VeiculoDTO> getAllVeiculo();
    List<Veiculo> getAllOrderByValue();
    void save (Veiculo veiculo);

    List<Veiculo> getByModel(String model);
}
