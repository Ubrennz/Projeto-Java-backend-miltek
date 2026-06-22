package com.projetomiltek.miltek.service;

import com.projetomiltek.miltek.model.Laticinio;
import com.projetomiltek.miltek.repositories.LaticinioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LaticinioService {
    @Autowired
    private LaticinioRepository laticinioRepository;

    public Laticinio findById(Long id) {
        Optional<Laticinio> laticinio = laticinioRepository.findById(id);
        return laticinio.get();
    }

    public List<Laticinio> findAll() {
        return laticinioRepository.findAll();
    }
}
