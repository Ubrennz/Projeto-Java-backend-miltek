package com.projetomiltek.miltek.service;

import com.projetomiltek.miltek.model.Despesa;
import com.projetomiltek.miltek.repositories.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DespesaService {
    @Autowired
    private DespesaRepository despesaRepository;

    public Despesa findById(Long id) {
        Optional<Despesa> despesa = despesaRepository.findById(id);
        return despesa.get();
    }

    public List<Despesa> findAll() {
        return despesaRepository.findAll();
    }
}
