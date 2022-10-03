package com.example.poospring01.aula03.aulaAoVivo.repository;

import com.example.poospring01.aula03.aulaAoVivo.model.Veiculo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.Arrays;
import java.util.List;

@Repository
public class VeiculoRepository {
    private final String linkFile = "src/main/resources/veiculos.json";
    ObjectMapper mapper = new ObjectMapper();

    public Veiculo getVeiculo(String placa){
        List<Veiculo> veiculos = null;
        try {
            veiculos = Arrays.asList(mapper.readValue(new File(linkFile), Veiculo[].class));
        }catch (Exception ex) {

        }

        for(Veiculo v:veiculos) {
            if(v.getPlaca().equals(placa)) {
                return v;
            }
        }

        return null;

    }
}
