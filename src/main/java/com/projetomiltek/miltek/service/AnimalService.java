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

    public Animal insert(Animal animal) {
        return animalRepository.save(animal);
    }

    public Animal findById(Long id) {
        Optional<Animal> animal = animalRepository.findById(id);
        return animal.get();
    }

    public List<Animal> findAll() {
        return animalRepository.findAll();
    }

    public void updateData(Animal entity, Animal animal) {
        entity.setStatus(animal.getStatus());
        entity.setSincronizado(animal.isSincronizado());
        entity.setAtualizadoEm(animal.getAtualizadoEm());
    }

    public Animal update(Long id, Animal animal) {
        Animal entity = animalRepository.getReferenceById(id);
        updateData(entity, animal);
        return animalRepository.save(entity);
    }

    public void delete(Long id) {
        animalRepository.deleteById(id);
    }

}
