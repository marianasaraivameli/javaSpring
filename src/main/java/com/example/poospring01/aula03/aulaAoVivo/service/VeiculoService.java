package com.example.poospring01.aula03.aulaAoVivo.service;

import com.example.poospring01.aula03.aulaAoVivo.exception.VeiculoNotFoundException;
import com.example.poospring01.aula03.aulaAoVivo.model.Veiculo;
import com.example.poospring01.aula03.aulaAoVivo.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeiculoService implements IVeiculo{

    @Autowired
    private VeiculoRepository repo;

    @Override
    public Veiculo getVeiculo(String placa) throws VeiculoNotFoundException {
        Optional<Veiculo> veiculo = repo.getVeiculo(placa);

        if(veiculo.isEmpty()) {
            throw new VeiculoNotFoundException("Veiculo não encontrado.");
        }
        return veiculo.get();
    }

    @Override
    public List<Veiculo> getAllVeiculo() {
        return null;
    }
}
