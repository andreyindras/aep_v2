package com.gestaolixoeletronico.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "lixos_eletronicos")
public class LixoEletronico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer quantidade; // Novo atributo

    public LixoEletronico() {
    }

    public LixoEletronico(String nome, Integer quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}