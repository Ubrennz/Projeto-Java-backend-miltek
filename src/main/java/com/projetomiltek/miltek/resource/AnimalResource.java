package com.projetomiltek.miltek.resource;

import com.projetomiltek.miltek.model.Animal;
import com.projetomiltek.miltek.service.AnimalService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/animais")
public class AnimalResource {

    private final AnimalService animalService;

    public AnimalResource(AnimalService animalService) {
        this.animalService = animalService;
    }

    @PostMapping
    public ResponseEntity<Animal> insert(@RequestBody Animal animal) {
        return ResponseEntity.status(HttpStatus.CREATED).body(animalService.insert(animal));
    }

    @GetMapping
    public ResponseEntity<List<Animal>> findAll() {
        List<Animal> animais = animalService.findAll();
        return ResponseEntity.ok().body(animais);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Animal> findById(@PathVariable Long id) {
        Animal animal = animalService.findById(id);
        return ResponseEntity.ok().body(animal);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Animal> update(@PathVariable Long id, @RequestBody Animal animal) {
        animal = animalService.update(id, animal);
        return ResponseEntity.ok().body(animal);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        animalService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
