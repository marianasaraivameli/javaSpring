package com.example.poospring01.aula02.praticaIntegradora.springJava;

import java.util.ArrayList;
import java.util.List;

public class AppCovid {
    public static void main(String[] args) {
        List<Sintoma> listaDeSintomas = new ArrayList<>();

        Sintoma s1 = new Sintoma("TOS01", "Tosse Seca",1 );
        Sintoma s2 = new Sintoma("DIA01", "Diarréia",2 );
        Sintoma s3 = new Sintoma("FEB01", "Febre",3 );
        Sintoma s4 = new Sintoma("FAR01", "Falta de ar",4 );

        Pessoa p1 = new Pessoa("PES01", "Mariana", "Saraiva", 61, s1);
        Pessoa p2 = new Pessoa("PES02", "Hugo", "Daniel", 22, s2);
        Pessoa p3 = new Pessoa("PES03", "Gabriel", "Fontes", 19, s3);
        Pessoa p4 = new Pessoa("PES04", "Nathalia", "Miranda", 67, s4);


        listaDeSintomas.add(s1);
        listaDeSintomas.add(s2);
        listaDeSintomas.add(s3);
        listaDeSintomas.add(s4);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        System.out.println(listaDeSintomas);
    }
}
