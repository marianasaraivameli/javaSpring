package com.example.poospring01.aula03.aulaAoVivo.service;

import com.example.poospring01.aula03.aulaAoVivo.dto.VeiculoDTO;
import com.example.poospring01.aula03.aulaAoVivo.exception.NotFoundException;
import com.example.poospring01.aula03.aulaAoVivo.model.Veiculo;
import com.example.poospring01.aula03.aulaAoVivo.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VeiculoService implements IVeiculo{

    @Autowired
    private VeiculoRepository repo;

    @Override
    public Veiculo getVeiculo(String placa) throws NotFoundException {
        Optional<Veiculo> veiculo = repo.getVeiculo(placa);

        if(veiculo.isEmpty()) {
            throw new NotFoundException("Veiculo não encontrado.");
        }
        return veiculo.get();
    }

//    @Override
//    public List<Veiculo> getAllVeiculo() {
//
//        return repo.getAll();
//    }

    @Override
    public List<VeiculoDTO> getAllVeiculo() {
        // map transforma um conjunto de dados em outro tipo de classe.
        return repo.getAll().stream()
//                .map(v -> new VeiculoDTO(v)
                .map(VeiculoDTO::new)
                .collect(Collectors.toList());
    }

    @Override
    public List<Veiculo> getAllOrderByValue() {
        List<Veiculo> veiculos = repo.getAll();
        return veiculos.stream().sorted().collect(Collectors.toList());
    }

    @Override
    public void save(Veiculo veiculo) {
        repo.saveVeiculo(veiculo);
    }

    @Override
    public List<Veiculo> getByModel(String model) {
        return getAllOrderByValue().stream()
                .filter(v -> v.getModelo().equalsIgnoreCase(model))
                .collect(Collectors.toList());
    }


}
