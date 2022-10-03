package com.example.poospring01.aula03.aulaAoVivo.controller;

import com.example.poospring01.aula03.aulaAoVivo.exception.NotFoundException;
import com.example.poospring01.aula03.aulaAoVivo.model.Veiculo;
import com.example.poospring01.aula03.aulaAoVivo.service.IVeiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {
    // o spring gera automaticamente este objeto usando o @Autowired, usando a injeção de dependência. Ou seja o framework gera o objeto.
    // private VeiculoService service = new VeiculoService();

    @Autowired
//    private VeiculoService service;
    private IVeiculo service;

    @GetMapping("/{placa}")
    public ResponseEntity<Veiculo> getVeiculo(@PathVariable String placa) {
        Veiculo veiculo = service.getVeiculo(placa);
        return new ResponseEntity<>(veiculo, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Veiculo>> getAll() {
        return new ResponseEntity<>(service.getAllVeiculo(), HttpStatus.OK);
    }

    @GetMapping("/byvalue")
    public ResponseEntity<List<Veiculo>> getAllByValue() {
        return new ResponseEntity<>(service.getAllOrderByValue(), HttpStatus.OK);
    }

    @GetMapping("/model/{model}")
    public ResponseEntity<List<Veiculo>> getAllByModel(@PathVariable String model) {
        return new ResponseEntity<>(service.getByModel(model), HttpStatus.OK);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Veiculo veiculo) {
        service.save(veiculo);
    }
}
