package com.example.poospring01.aula02.praticaIntegradora.springJava;

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
@RequestMapping("findSymptom")
public class CovidController {
    static List<Sintoma> listaDeSintomas = new ArrayList<>();

    Sintoma s1 = new Sintoma("TOS01", "Tosse Seca",1 );
    Sintoma s2 = new Sintoma("DIA01", "Diarréia",2 );
    Sintoma s3 = new Sintoma("FEB01", "Febre",3 );
    Sintoma s4 = new Sintoma("FAR01", "Falta de ar",4 );
    Sintoma s5 = new Sintoma("DCO07", "Dor no corpo",2 );

    public CovidController() {
        listaDeSintomas.add(s1);
        listaDeSintomas.add(s2);
        listaDeSintomas.add(s3);
        listaDeSintomas.add(s4);
        listaDeSintomas.add(s5);
    }
    @GetMapping
    public ResponseEntity<List<Sintoma>> findSintomas() {
        return new ResponseEntity<>(listaDeSintomas, HttpStatus.OK); // 200
    }

//    @GetMapping("/{sintoma}")
//    public ResponseEntity<Integer> getSintoma(@PathVariable String sintoma) {
//        Optional<Sintoma> sintomaOptional = listaDeSintomas.stream()
//                .filter(s -> s.getNome().equals(sintoma))
//                .findFirst();
//
//        return new ResponseEntity<>(sintomaOptional.get().getNivelDeGravidade(), HttpStatus.OK);
//    }

    @GetMapping("/{sintoma}")
    public ResponseEntity<SintomaDTO> getSintoma(@PathVariable String sintoma) {
        Optional<Sintoma> sintomaOptional = listaDeSintomas.stream()
                .filter(s -> s.getNome().equals(sintoma))
                .findFirst();
        SintomaDTO sintomaDTO = new SintomaDTO(sintomaOptional.get());

        return new ResponseEntity<>(sintomaDTO, HttpStatus.OK);
    }
}
