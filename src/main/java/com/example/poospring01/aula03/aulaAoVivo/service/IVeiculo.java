package com.example.poospring01.aula03.aulaAoVivo.service;

import com.example.poospring01.aula03.aulaAoVivo.exception.NotFoundException;
import com.example.poospring01.aula03.aulaAoVivo.model.Veiculo;

import java.util.List;

public interface IVeiculo {
    Veiculo getVeiculo(String placa) throws NotFoundException;
    List<Veiculo> getAllVeiculo();
}
