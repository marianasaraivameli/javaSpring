package com.example.poospring01.aula03.praticaIntegradora.service;

import com.example.poospring01.aula03.aulaAoVivo.model.Veiculo;
import com.example.poospring01.aula03.praticaIntegradora.model.VeiculoPratice;
import com.example.poospring01.aula03.praticaIntegradora.repository.VeiculoPraticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeiculoPraticeService implements IVeiculoPratice {

    @Autowired
    private VeiculoPraticeRepository repository;

    @Override
    public List<VeiculoPratice> getAllVeiculos() {

        return repository.getAllVeiculos();
    }

    @Override
    public void adicionaVeiculo(VeiculoPratice veiculo) {
        repository.adicionaVeiculo(veiculo);
    }

    @Override
    public Optional<VeiculoPratice> getById(int id) {
        Optional<VeiculoPratice> veiculo = repository.getAllVeiculos()
                .stream()
                .filter(v -> v.getId() == id)
                .findFirst();
        if (veiculo.isEmpty()) {
            System.out.println("Not Found");
        }
        return veiculo;
    }
}
