package com.example.poospring01.aula03.praticaIntegradora.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServicoPratice {
    private int id;
    private String date;
    private String kilometers;
    private String descriptions;
    private List<VeiculoPratice> services;

    public void addServicoAoVeiculo(VeiculoPratice veiculoPratice) {
        if(services == null) {
            services = new ArrayList<>();
        }
        services.add(veiculoPratice);
    }
}
