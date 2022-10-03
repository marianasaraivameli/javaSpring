package com.example.poospring01.aula03.aulaAoVivo.service;

import com.example.poospring01.aula03.aulaAoVivo.model.Veiculo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService implements IVeiculo{

    @Override
    public Veiculo getVeiculo(String placa) {
        return new Veiculo(placa, "Uno", 2022, 15_000.0);
    }

    @Override
    public List<Veiculo> getAllVeiculo() {
        return null;
    }
}
