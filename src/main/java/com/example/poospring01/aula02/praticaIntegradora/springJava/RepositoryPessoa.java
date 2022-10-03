package com.example.poospring01.aula02.praticaIntegradora.springJava;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Data
@AllArgsConstructor
public class RepositoryPessoa {
    private List<Pessoa> listaDePessoas;

    public void savePessoa(Pessoa pessoa) {
        listaDePessoas.add(pessoa);
    }
}
