package com.projetomiltek.miltek.resource;

import com.projetomiltek.miltek.model.Despesa;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/despesas")
public class DespesaResource {
    @GetMapping
    public ResponseEntity<List<Despesa>> findAll() {
        List<Despesa> despesas = new ArrayList<>();

        despesas.add(new Despesa(4, 1, "Bananas", "São bananas", 2.0, LocalDate.parse("2025-04-11"), true, LocalDateTime.now()));
        despesas.add(new Despesa(3, 1, "Bananas", "São bananas", 2.0, LocalDate.parse("2025-04-11"), true, LocalDateTime.now()));

        return ResponseEntity.ok().body(despesas);
    }
}
