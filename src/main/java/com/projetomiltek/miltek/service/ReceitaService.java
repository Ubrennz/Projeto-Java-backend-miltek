package com.projetomiltek.miltek.service;

import com.projetomiltek.miltek.model.Receita;
import com.projetomiltek.miltek.repositories.ReceitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReceitaService {
    @Autowired
    private ReceitaRepository receitaRepository;

    public Receita findById(Long id) {
        Optional<Receita> receita = receitaRepository.findById(id);
        return receita.get();
    }

    public List<Receita> findAll() {
        return receitaRepository.findAll();
    }
}
