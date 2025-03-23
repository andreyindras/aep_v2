package com.gestaolixoeletronico.repository;

import com.gestaolixoeletronico.entities.LixoEletronico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LixoEletronicoRepository extends JpaRepository<LixoEletronico, Long> {
}