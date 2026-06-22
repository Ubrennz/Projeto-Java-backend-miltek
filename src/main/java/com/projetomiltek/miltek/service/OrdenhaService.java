package com.projetomiltek.miltek.service;

import com.projetomiltek.miltek.model.Ordenha;
import com.projetomiltek.miltek.repositories.OrdenhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdenhaService {
    @Autowired
    private OrdenhaRepository ordenhaRepository;

    public Ordenha findById(Long id) {
        Optional<Ordenha> ordenha = ordenhaRepository.findById(id);
        return ordenha.get();
    }

    public List<Ordenha> findAll() {
        return ordenhaRepository.findAll();
    }
}
