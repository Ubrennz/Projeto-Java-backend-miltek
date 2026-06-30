package com.projetomiltek.miltek.resource;

import com.projetomiltek.miltek.model.Animal;
import com.projetomiltek.miltek.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/animais")
public class AnimalResource {
    @Autowired
    private AnimalService animalService;

    @PostMapping
    public ResponseEntity<Animal> insert(@RequestBody Animal animal) {
        return ResponseEntity.status(HttpStatus.CREATED).body(animalService.insert(animal));
    }

    @GetMapping
    public ResponseEntity<List<Animal>> findAll() {
        List<Animal> animais = animalService.findAll();
        return ResponseEntity.ok().body(animais);
    }
}
