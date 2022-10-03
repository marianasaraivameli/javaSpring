package com.example.poospring01.aula03.aulaAoVivo.service;

import com.example.poospring01.aula03.aulaAoVivo.model.Veiculo;
import com.example.poospring01.aula03.aulaAoVivo.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService implements IVeiculo{

    @Autowired
    private VeiculoRepository repo;

    @Override
    public Veiculo getVeiculo(String placa) {
        return repo.getVeiculo(placa);
    }

    @Override
    public List<Veiculo> getAllVeiculo() {
        return null;
    }
}
