package com.example.poospring01.aula03.aulaAoVivo.repository;

import com.example.poospring01.aula03.aulaAoVivo.model.Proprietario;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.Arrays;
import java.util.List;

@Repository
public class ProprietarioRepository {
    private String linkFile = "src/main/resources/proprietario.json";

    public List<Proprietario> getAll() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return Arrays.asList(mapper.readValue(new File(linkFile), Proprietario[].class));
        } catch(Exception ex) {
            System.out.println("Erro ao ler o arquivo");
        }
        return null;
    }
}
