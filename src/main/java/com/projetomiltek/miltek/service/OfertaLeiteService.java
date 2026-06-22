package com.projetomiltek.miltek.service;

import com.projetomiltek.miltek.model.OfertaLeite;
import com.projetomiltek.miltek.repositories.OfertaLeiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OfertaLeiteService {
    @Autowired
    private OfertaLeiteRepository ofertaLeiteRepository;

    public OfertaLeite findById(Long id) {
        Optional<OfertaLeite> ofertaLeite = ofertaLeiteRepository.findById(id);
        return ofertaLeite.get();
    }

    public List<OfertaLeite> findAll() {
        return ofertaLeiteRepository.findAll();
    }
}
