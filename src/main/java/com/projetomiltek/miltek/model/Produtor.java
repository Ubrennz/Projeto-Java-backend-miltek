package com.projetomiltek.miltek.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "produtor")
public class Produtor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private Double latitude;
    private Double longitude;
    private String status;
    private LocalDate criadoEm;
    private boolean sincronizado;
    private LocalDateTime atualizadoEm;

    @JsonIgnore
    @OneToMany(mappedBy = "produtor")
    private List<Animal> animais = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "produtor")
    private List<OfertaLeite> ofertaLeites = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "produtor")
    private List<Despesa> despesas = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "produtor")
    private List<Receita> receitas = new ArrayList<>();

    public Produtor() {
    }

    public Produtor(Long id, String nome, String cpf, String telefone, String endereco, double latitude, double longitude, String status, LocalDate criadoEm, boolean sincronizado, LocalDateTime atualizadoEm) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.latitude = latitude;
        this.longitude = longitude;
        this.status = status;
        this.criadoEm = criadoEm;
        this.sincronizado = sincronizado;
        this.atualizadoEm = atualizadoEm;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(LocalDate criadoEm) {
        this.criadoEm = criadoEm;
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

    public List<Animal> getAnimais() {
        return animais;
    }

    public List<OfertaLeite> getOfertaLeites() {
        return ofertaLeites;
    }

    public List<Despesa> getDespesas() {
        return despesas;
    }

    public List<Receita> getReceitas() {
        return receitas;
    }
}
