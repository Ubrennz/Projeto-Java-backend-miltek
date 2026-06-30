package com.projetomiltek.miltek.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "animal")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String raca;
    private String sexo;
    private LocalDate dataNascimento;
    private String status;
    private byte[] foto;
    private boolean sincronizado;
    private LocalDateTime atualizadoEm;

    @JsonIgnore
    @OneToMany(mappedBy = "animal")
    private List<Ordenha> ordenhas = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "animal")
    private List<EventoSanitario> eventoSanitarios = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "produtor_id")
    private Produtor produtor;

    public Animal() {
    }

    public Animal(Long id, String nome, String raca, String sexo, LocalDate dataNascimento, String status, byte[] foto, boolean sincronizado, LocalDateTime atualizadoEm, Produtor produtor) {
        this.id = id;
        this.nome = nome;
        this.raca = raca;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.status = status;
        this.foto = foto;
        this.sincronizado = sincronizado;
        this.atualizadoEm = atualizadoEm;
        this.produtor = produtor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
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

    public List<Ordenha> getOrdenhas() {
        return ordenhas;
    }

    public List<EventoSanitario> getEventoSanitarios() {
        return eventoSanitarios;
    }

    public Produtor getProdutor() {
        return produtor;
    }

    public void setProdutor(Produtor produtor) {
        this.produtor = produtor;
    }
}
