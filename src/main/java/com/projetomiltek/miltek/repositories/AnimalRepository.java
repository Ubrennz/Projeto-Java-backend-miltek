package com.projetomiltek.miltek.repositories;

import com.projetomiltek.miltek.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {

}
