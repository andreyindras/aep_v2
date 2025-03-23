package com.gestaolixoeletronico.controller;

import com.gestaolixoeletronico.entities.LixoEletronico;
import com.gestaolixoeletronico.service.LixoEletronicoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lixos-eletronicos")
public class LixoEletronicoController {

    private final LixoEletronicoService service;

    public LixoEletronicoController(LixoEletronicoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<LixoEletronico>> listarTodos() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @PostMapping
    public ResponseEntity<LixoEletronico> criar(@RequestBody LixoEletronico lixoEletronico) {
        return ResponseEntity.ok(service.salvar(lixoEletronico));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}