package com.example.poospring01.aula03.praticaIntegradora.controller;

import com.example.poospring01.aula03.praticaIntegradora.model.VeiculoPratice;
import com.example.poospring01.aula03.praticaIntegradora.service.IVeiculoPratice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/api/veiculos")
public class VeiculosPraticeController {

    @Autowired
    private IVeiculoPratice service;

    @GetMapping
    public ResponseEntity<List<VeiculoPratice>> getAllVeiculos () {
        return new ResponseEntity<>(service.getAllVeiculos(), HttpStatus.CREATED);
    }
}
