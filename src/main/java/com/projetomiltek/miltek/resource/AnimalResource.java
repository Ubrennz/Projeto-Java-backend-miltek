package com.projetomiltek.miltek.resource;

import com.projetomiltek.miltek.model.Animal;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/animais")
public class AnimalResource {
    @GetMapping
    public ResponseEntity<List<Animal>> findAll() {
        List<Animal> animais = new ArrayList<>();

        animais.add(new Animal(1, 1, "mimosa", "vaca", "M", LocalDate.parse("2024-06-14"), "a", null, false, LocalDateTime.now()));
        animais.add(new Animal(2, 1, "kaka", "vaca", "F", LocalDate.parse("2024-04-20"), "b", null, true, LocalDateTime.now()));

        return ResponseEntity.ok().body(animais);
    }
}
