package com.example.poospring01.aula03.praticaIntegradora.repository;

import com.example.poospring01.aula03.praticaIntegradora.model.VeiculoPratice;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.Arrays;
import java.util.List;

@Repository
public class VeiculoPraticeRepository {
    private final String linkFileVeiculosPratice = "src/main/resources/veiculosPratice.json";
    ObjectMapper mapperVeiculo = new ObjectMapper();

    public List<VeiculoPratice> getAllVeiculo() {
        List<VeiculoPratice> veiculos = null;
        try {
            veiculos = Arrays.asList(mapperVeiculo.readValue(new File(linkFileVeiculosPratice), VeiculoPratice[].class));
            System.out.println(veiculos);
        } catch (Exception ex) {
            System.out.println(veiculos);
            System.out.println("Erro ao chamar getAllVeiculos");
        }

        return veiculos;
    }
}
