package com.projetomiltek.miltek.service;

import com.projetomiltek.miltek.model.Animal;
import com.projetomiltek.miltek.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {
    @Autowired
    private AnimalRepository animalRepository;

    public Animal findById(Long id) {
        Optional<Animal> animal = animalRepository.findById(id);
        return animal.get();
    }

    public List<Animal> findAll() {
        return animalRepository.findAll();
    }
}
