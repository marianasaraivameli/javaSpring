package com.example.poospring01.aula02.praticaIntegradora.springJava;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
@Data
@AllArgsConstructor
public class RepositoryPessoa {
    private final String linkFilePessoas = "src/main/resources/pessoas.json";

    ObjectMapper mapperPessoas = new ObjectMapper();

    public List<Pessoa> getPessoas() {
        List<Pessoa> pessoas = null;

        try {
            pessoas = Arrays.asList(mapperPessoas.readValue(new File(linkFilePessoas), Pessoa[].class));
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        return pessoas;
    }

//    public void savePessoa(Pessoa pessoa) {
//        listaDePessoas.add(pessoa);
//    }
}
