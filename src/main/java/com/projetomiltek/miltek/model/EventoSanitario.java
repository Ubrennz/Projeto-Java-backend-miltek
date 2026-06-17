package com.projetomiltek.miltek.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "evento_sanitario")
public class EventoSanitario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int animalId;
    private String tipo;
    private String descricao;
    private LocalDate dataEvento;
    private LocalDate dataPrevista;
    private String status;
    private boolean sincronizado;
    private LocalDateTime atualizadoEm;

    public EventoSanitario() {
    }

    public EventoSanitario(int id, int animalId, String tipo, String descricao,
                            LocalDate dataEvento, LocalDate dataPrevista, String status,
                            boolean sincronizado, LocalDateTime atualizadoEm) {
        this.id = id;
        this.animalId = animalId;
        this.tipo = tipo;
        this.descricao = descricao;
        this.dataEvento = dataEvento;
        this.dataPrevista = dataPrevista;
        this.status = status;
        this.sincronizado = sincronizado;
        this.atualizadoEm = atualizadoEm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }

    public LocalDate getDataPrevista() {
        return dataPrevista;
    }

    public void setDataPrevista(LocalDate dataPrevista) {
        this.dataPrevista = dataPrevista;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
}
