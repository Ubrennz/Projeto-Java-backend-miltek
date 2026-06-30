package com.projetomiltek.miltek.config;

import com.projetomiltek.miltek.model.Animal;
import com.projetomiltek.miltek.model.Produtor;
import com.projetomiltek.miltek.repositories.AnimalRepository;
import com.projetomiltek.miltek.repositories.ProdutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private ProdutorRepository produtorRepository;

    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public void run(String... args) throws Exception {
        Produtor produtor = new Produtor(
                null,
                "João da Silva",
                "12345678901",
                "81999999999",
                "Sítio Boa Vista - Zona Rural",
                -8.890123,
                -36.496789,
                "Ativo",
                LocalDate.now(),
                true,
                LocalDateTime.now()
        );

        produtor = produtorRepository.save(produtor);

        Animal animal = new Animal(
                null,
                "Mimosa",
                "Holandesa",
                "Fêmea",
                LocalDate.of(2022, 5, 18),
                "Ativo",
                null,
                true,
                LocalDateTime.now(),
                produtor
        );

        animalRepository.save(animal);

        System.out.println("Dados de teste inseridos com sucesso!");
    }
}
