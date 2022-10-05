package com.example.poospring01.aula03.praticaIntegradora.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VeiculoPratice {
    private int id;
    private String brand;
    private String model;
    private String manufactoringDate;
    private String numberOfKilometers;
    private String doors;
    private String price;
    private String currency;
    private int id_services;
    private String countOfOwners;
}
