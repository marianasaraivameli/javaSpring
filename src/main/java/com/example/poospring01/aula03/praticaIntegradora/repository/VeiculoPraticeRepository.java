package com.example.poospring01.aula03.praticaIntegradora.repository;

import com.example.poospring01.aula03.aulaAoVivo.model.Veiculo;
import com.example.poospring01.aula03.praticaIntegradora.model.VeiculoPratice;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class VeiculoPraticeRepository {
    private final String linkFile = "src/main/resources/veiculosPratice.json";
    ObjectMapper mapper = new ObjectMapper();

    public List<VeiculoPratice> getAllVeiculos() {
        List<VeiculoPratice> veiculos = null;
        try {
            veiculos = Arrays.asList(mapper.readValue(new File(linkFile), VeiculoPratice[].class));
        } catch (Exception ex) {

        }

        return veiculos;
    }

    public void adicionaVeiculo(VeiculoPratice novoVeiculo) {
        ObjectMapper mapper = new ObjectMapper();

        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());

        List<VeiculoPratice> veiculos = getAllVeiculos();
        veiculos = new ArrayList<>(veiculos);
        veiculos.add(novoVeiculo);

        try{
            writer.writeValue(new File(linkFile), veiculos);
        } catch(Exception ex) {
            System.out.println("Erro ao adicionar novo veiculo");
        }
    }
}