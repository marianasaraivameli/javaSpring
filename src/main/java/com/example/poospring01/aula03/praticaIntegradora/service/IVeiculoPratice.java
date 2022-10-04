package com.example.poospring01.aula03.praticaIntegradora.service;

import com.example.poospring01.aula03.aulaAoVivo.model.Veiculo;
import com.example.poospring01.aula03.praticaIntegradora.model.VeiculoPratice;

import java.util.List;

public interface IVeiculoPratice {
    List<VeiculoPratice> getAllVeiculos();
    void adicionaVeiculo (VeiculoPratice veiculo);

}
