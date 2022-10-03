package com.example.poospring01.aula02.praticaIntegradora.springJava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/findRiskPerson")
public class PessoaController {
    @Autowired
    private RepositoryPessoa pessoaRepository;


//    @PostMapping
//    public ResponseEntity<Pessoa> postPessoa(@RequestBody Pessoa pessoa) {
//        pessoaRepository.savePessoa(pessoa);
//        return new ResponseEntity<>(pessoa, HttpStatus.CREATED);
//    }

    // usando o objeto pessoaDTO para retornar apenas os dados que eu quero, resguardando as informações sigilosas do cliente.
    @PostMapping
    public ResponseEntity<PessoaDTO> postPessoa(@RequestBody Pessoa pessoa) {
        pessoaRepository.savePessoa(pessoa);
        PessoaDTO pessoaDTO = new PessoaDTO(pessoa);
        return new ResponseEntity<>(pessoaDTO, HttpStatus.CREATED);
    }

    @GetMapping("/risk")
    public ResponseEntity<List<Pessoa>> getPessoasIdosas() {
        List<Pessoa> pessoasRisk = pessoaRepository.getPessoas().stream()
                .filter(p -> p.getIdade() >= 60)
                .collect(Collectors.toList());

        return new ResponseEntity<>(pessoasRisk, HttpStatus.OK);
    }


    @GetMapping
    public ResponseEntity<List<Pessoa>> getAllPessoas() {
        return new ResponseEntity<>(pessoaRepository.getPessoas(), HttpStatus.OK);
    }
}
