package com.projetomiltek.miltek.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "laticinio")
public class Laticinio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String cnpj;
    private String telefone;
    private String endereco;
    private double latitude;
    private double longitude;
    private double precoLitro;
    private String status;
    private boolean sincronizado;
    private LocalDateTime atualizadoEm;

    @JsonIgnore
    @OneToMany(mappedBy = "laticinio")
    private List<OfertaLeite> ofertaLeites = new ArrayList<>();

    public Laticinio() {
    }

    public Laticinio(int id, String nome, String cnpj, String telefone, String endereco, double latitude, double longitude, double precoLitro, String status, boolean sincronizado, LocalDateTime atualizadoEm, List<OfertaLeite> ofertaLeites) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.endereco = endereco;
        this.latitude = latitude;
        this.longitude = longitude;
        this.precoLitro = precoLitro;
        this.status = status;
        this.sincronizado = sincronizado;
        this.atualizadoEm = atualizadoEm;
        this.ofertaLeites = ofertaLeites;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getPrecoLitro() {
        return precoLitro;
    }

    public void setPrecoLitro(double precoLitro) {
        this.precoLitro = precoLitro;
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

    public List<OfertaLeite> getOfertaLeites() {
        return ofertaLeites;
    }
}
