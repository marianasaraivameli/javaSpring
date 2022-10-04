package com.example.poospring01.aula03.praticaIntegradora.service;

import com.example.poospring01.aula03.praticaIntegradora.model.VeiculoPratice;
import com.example.poospring01.aula03.praticaIntegradora.repository.VeiculoPraticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoPraticeService implements IVeiculoPratice {

    @Autowired
    private VeiculoPraticeRepository repository;

    @Override
    public List<VeiculoPratice> getAllVeiculos() {
        return repository.getAllVeiculo();
    }
}
