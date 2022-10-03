package com.example.poospring01.aula02.praticaIntegradora.springJava;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.ArrayList;
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

    public void savePessoa(Pessoa novaPessoa) {
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());

        List<Pessoa> listDePessoas = getPessoas();
        listDePessoas = new ArrayList<>(listDePessoas);
        listDePessoas.add(novaPessoa);

        try {
            writer.writeValue(new File(linkFilePessoas), listDePessoas);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
