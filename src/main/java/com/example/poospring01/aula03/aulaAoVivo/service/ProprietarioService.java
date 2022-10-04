package com.example.poospring01.aula03.aulaAoVivo.service;

import com.example.poospring01.aula03.aulaAoVivo.model.Proprietario;
import com.example.poospring01.aula03.aulaAoVivo.model.Veiculo;
import com.example.poospring01.aula03.aulaAoVivo.repository.ProprietarioRepository;
import com.example.poospring01.aula03.aulaAoVivo.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProprietarioService implements IProprietario{

    @Autowired
    private VeiculoRepository veiculoRepository;

    @Autowired
    private ProprietarioRepository proprietarioRepository;

    @Override
    public List<Proprietario> getAll() {
        List<Veiculo> veiculoList = new ArrayList<>(veiculoRepository.getAll());
        List<Proprietario> proprietarioList = new ArrayList<>(proprietarioRepository.getAll());

        proprietarioList.stream()
                .forEach(proprietario -> {
                    for (int i = 0; i < veiculoList.size(); i++) {
                        if(veiculoList.get(i).getId_proprietario() == proprietario.getId()) {
                            proprietario.addVeiculo(veiculoList.remove(i));
                            i--;
                        }
                    }
                });

        return proprietarioList;
    }
}
