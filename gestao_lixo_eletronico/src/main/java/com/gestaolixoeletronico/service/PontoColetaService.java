package com.gestaolixoeletronico.service;

import com.gestaolixoeletronico.entities.LixoEletronico;
import com.gestaolixoeletronico.entities.PontoColeta;
import com.gestaolixoeletronico.repository.LixoEletronicoRepository;
import com.gestaolixoeletronico.repository.PontoColetaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PontoColetaService {
    private final PontoColetaRepository repository;
    private final LixoEletronicoRepository lixoEletronicoRepository;

    public PontoColetaService(PontoColetaRepository repository, LixoEletronicoRepository lixoEletronicoRepository) {
        this.repository = repository;
        this.lixoEletronicoRepository = lixoEletronicoRepository;

    }

    public List<PontoColeta> listarTodos() {
        return repository.findAll();
    }

    public Optional<PontoColeta> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public List<PontoColeta> buscarPorUsuario(Long usuarioId) {
        return repository.findByUsuarioId(usuarioId);
    }

    public PontoColeta salvar(PontoColeta pontoColeta) {
        return repository.save(pontoColeta);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public PontoColeta adicionarLixoEletronico(Long pontoColetaId, Long lixoEletronicoId) {
        PontoColeta pontoColeta = repository.findById(pontoColetaId).orElseThrow(() -> new RuntimeException("Ponto de coleta não encontrado"));
        LixoEletronico lixoEletronico = lixoEletronicoRepository.findById(lixoEletronicoId).orElseThrow(() -> new RuntimeException("Lixo eletrônico não encontrado"));
        pontoColeta.getLixosEletronicos().add(lixoEletronico);
        return repository.save(pontoColeta);
    }

    public PontoColeta removerLixoEletronico(Long pontoColetaId, Long lixoEletronicoId) {
        PontoColeta pontoColeta = repository.findById(pontoColetaId).orElseThrow(() -> new RuntimeException("Ponto de coleta não encontrado"));
        LixoEletronico lixoEletronico = lixoEletronicoRepository.findById(lixoEletronicoId).orElseThrow(() -> new RuntimeException("Lixo eletrônico não encontrado"));
        pontoColeta.getLixosEletronicos().remove(lixoEletronico);
        return repository.save(pontoColeta);
    }
}