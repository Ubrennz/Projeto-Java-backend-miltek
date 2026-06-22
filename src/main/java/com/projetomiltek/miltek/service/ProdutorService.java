package com.projetomiltek.miltek.service;

import com.projetomiltek.miltek.model.Produtor;
import com.projetomiltek.miltek.repositories.ProdutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutorService {
    @Autowired
    private ProdutorRepository produtorRepository;

    public Produtor findById(Long id) {
        Optional<Produtor> produtor = produtorRepository.findById(id);
        return produtor.get();
    }

    public List<Produtor> findAll() {
        return produtorRepository.findAll();
    }
}
