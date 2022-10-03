package com.example.poospring01.aula03.aulaAoVivo.repository;

import com.example.poospring01.aula03.aulaAoVivo.model.Veiculo;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
@Log4j2
public class VeiculoRepository {
    private final String linkFile = "src/main/resources/veiculos.json";
    ObjectMapper mapper = new ObjectMapper();

    public Optional<Veiculo> getVeiculo(String placa){
        List<Veiculo> veiculos = null;
        try {
            veiculos = Arrays.asList(mapper.readValue(new File(linkFile), Veiculo[].class));
        }catch (Exception ex) {

        }

        for(Veiculo v:veiculos) {
            if(v.getPlaca().equals(placa)) {
                return Optional.of(v);
            }
        }

        return Optional.empty();
    }

    public List<Veiculo> getAll() {
        List<Veiculo> veiculos = null;
        try {
            veiculos = Arrays.asList(mapper.readValue(new File(linkFile), Veiculo[].class));
        }catch (Exception ex) {

        }

        return veiculos;
    }
}
