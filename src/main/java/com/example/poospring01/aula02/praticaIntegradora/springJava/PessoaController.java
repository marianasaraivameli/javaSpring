package com.example.poospring01.aula02.praticaIntegradora.springJava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/findRiskPerson")
public class PessoaController {
    @Autowired
    private RepositoryPessoa pessoaRepository;


    @PostMapping
    public ResponseEntity<Pessoa> postPessoa(@RequestBody Pessoa pessoa) {
        pessoaRepository.savePessoa(pessoa);
        return new ResponseEntity<>(pessoa, HttpStatus.OK);
    }



//    @GetMapping("/all")
//    public ResponseEntity<Pessoa> getAllPessoas() {
//        return ResponseEntity<Pessoa> pessoasLista;
//    }

}
