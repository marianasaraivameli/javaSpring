package com.example.poospring01.aula02.praticaIntegradora.springJava;

import com.example.poospring01.aula02.aulaAoVivo.model.Produto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("findSymptom")
public class CovidController extends AppCovid{
    static List<Sintoma> listaDeSintomas = new ArrayList<>();

    Sintoma s1 = new Sintoma("TOS01", "Tosse Seca",1 );
    Sintoma s2 = new Sintoma("DIA01", "Diarréia",2 );
    Sintoma s3 = new Sintoma("FEB01", "Febre",3 );
    Sintoma s4 = new Sintoma("FAR01", "Falta de ar",4 );

    Pessoa p1 = new Pessoa("PES01", "Mariana", "Saraiva", 61, s1);
    Pessoa p2 = new Pessoa("PES02", "Hugo", "Daniel", 22, s2);
    Pessoa p3 = new Pessoa("PES03", "Gabriel", "Fontes", 19, s3);
    Pessoa p4 = new Pessoa("PES04", "Nathalia", "Miranda", 67, s4);

    public CovidController() {
        listaDeSintomas.add(s1);
        listaDeSintomas.add(s2);
        listaDeSintomas.add(s3);
        listaDeSintomas.add(s4);
    }
    @GetMapping
        public ResponseEntity<List<Sintoma>> findSintomas() {
            return new ResponseEntity<>(listaDeSintomas, HttpStatus.OK); // 200
    }
}
