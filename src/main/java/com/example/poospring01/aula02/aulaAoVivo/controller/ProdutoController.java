package com.example.poospring01.aula02.aulaAoVivo.controller;

import com.example.poospring01.aula02.aulaAoVivo.dto.ProdutoDTO;
import com.example.poospring01.aula02.aulaAoVivo.model.Produto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); // 404
        }


        return new ResponseEntity<>(produto.get(), HttpStatus.OK); // 200
    }

//    @GetMapping("/id")
//    public ResponseEntity<ProdutoDTO> getProduto(@PathVariable int id) {
//        Optional<Produto> produto = produtos.stream()
//                .filter(p -> p.getId() == id)
//                .findFirst();
//
//        if(produto.isEmpty()) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND); // 404
//        }
//
//        ProdutoDTO produtoDTO = new ProdutoDTO(produto.get());
//        return new ResponseEntity<>(produtoDTO, HttpStatus.OK); // 200
//    }

    @PostMapping
    public ResponseEntity<Produto> novoProduto(@RequestBody Produto produto) {
        // para adicionar o id de forma "automática"
        produto.setId(produtos.size() + 1);
        produtos.add(produto);
        return new ResponseEntity<>(produto, HttpStatus.CREATED); // 201
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduto(@PathVariable int id) {
        Optional<Produto> produto = produtos.stream()
                .filter(p -> p.getId() == id)
                .findFirst();

        if(produto.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); // 404
        }

        produtos.remove(produto.get());
        return new ResponseEntity<>(HttpStatus.NO_CONTENT); // 204
    }

    @GetMapping("all")
    public ResponseEntity<List<Produto>> getAll() {
        return new ResponseEntity<>(produtos, HttpStatus.OK); // 200
        // mesmo retorno do anterior, escrito de outra forma
        // return ResponseEntity.ok(produtos);
    }
}
