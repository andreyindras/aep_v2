package com.gestaolixoeletronico.service;

import com.gestaolixoeletronico.entities.LixoEletronico;
import com.gestaolixoeletronico.repository.LixoEletronicoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LixoEletronicoService {

    private final LixoEletronicoRepository repository;

    public LixoEletronicoService(LixoEletronicoRepository repository) {
        this.repository = repository;
    }

    public List<LixoEletronico> listarTodos() {
        return repository.findAll();
    }

    public LixoEletronico salvar(LixoEletronico lixoEletronico) {
        return repository.save(lixoEletronico);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}