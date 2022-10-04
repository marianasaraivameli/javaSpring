package com.example.poospring01.aula03.praticaIntegradora.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VeiculoPratice extends ServiceVeiculo {
//    private int id;
    private String brand;
    private String model;
    private String manufactoringDate;
    private String numberOfKilometers;
    private String doors;
    private String price;
    private String currency;
    private List<ServiceVeiculo> services;
    private String countOfOwners;
}
