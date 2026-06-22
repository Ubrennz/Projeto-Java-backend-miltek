package com.projetomiltek.miltek.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "ordenha")
public class Ordenha {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate data;
    private String turno;
    private double litros;
    private String observacao;
    private boolean sincronizado;
    private LocalDateTime atualizadoEm;

    @ManyToOne
    @JoinColumn(name = "animal_id")
    private Animal animal;

    public Ordenha() {
    }

    public Ordenha(int id, LocalDate data, String turno, double litros, String observacao, boolean sincronizado, LocalDateTime atualizadoEm, Animal animal) {
        this.id = id;
        this.data = data;
        this.turno = turno;
        this.litros = litros;
        this.observacao = observacao;
        this.sincronizado = sincronizado;
        this.atualizadoEm = atualizadoEm;
        this.animal = animal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public boolean isSincronizado() {
        return sincronizado;
    }

    public void setSincronizado(boolean sincronizado) {
        this.sincronizado = sincronizado;
    }

    public LocalDateTime getAtualizadoEm() {
        return atualizadoEm;
    }

    public void setAtualizadoEm(LocalDateTime atualizadoEm) {
        this.atualizadoEm = atualizadoEm;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
