package com.example.poospring01.aula02.aulaAoVivo.controller;

import com.example.poospring01.aula02.aulaAoVivo.model.Produto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    List<Produto> produtos = new ArrayList<>();

    public ProdutoController() {
        produtos.add(new Produto(1, "Produto 01", 25.00));
        produtos.add(new Produto(2, "Produto 02", 30.00));
        produtos.add(new Produto(3, "Produto 03", 35.00));

    }

    @GetMapping("/id")
    public ResponseEntity<Produto> getProduto(@PathVariable int id) {
        Optional<Produto> produto = produtos.stream()
                .filter(p -> p.getId() == id)
                .findFirst();

        if(produto.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }


        return new ResponseEntity<>(produto.get(), HttpStatus.OK);
    }


}