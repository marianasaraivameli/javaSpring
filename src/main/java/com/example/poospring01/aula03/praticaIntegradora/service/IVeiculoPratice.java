package com.example.poospring01.aula03.praticaIntegradora.service;

import com.example.poospring01.aula03.aulaAoVivo.model.Veiculo;
import com.example.poospring01.aula03.praticaIntegradora.model.VeiculoPratice;

import java.util.List;
import java.util.Optional;

public interface IVeiculoPratice {
    List<VeiculoPratice> getAllVeiculos();
    void adicionaVeiculo (VeiculoPratice veiculo);

    Optional<VeiculoPratice> getById(int id);

}
