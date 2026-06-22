package com.projetomiltek.miltek.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "oferta_leite")
public class OfertaLeite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate dataOferta;
    private double volumeLitros;
    private double precoNegociado;
    private String status;
    private boolean sincronizado;
    private LocalDateTime atualizadoEm;

    @JsonIgnore
    @OneToMany(mappedBy = "ofertaLeite")
    private List<Receita> receitas = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "produtor_id")
    private Produtor produtor;

    @ManyToOne
    @JoinColumn(name = "laticinio_id")
    private Laticinio laticinio;

    public OfertaLeite() {
    }

    public OfertaLeite(int id, LocalDate dataOferta, double volumeLitros, double precoNegociado, String status, boolean sincronizado, LocalDateTime atualizadoEm, List<Receita> receitas, Produtor produtor, Laticinio laticinio) {
        this.id = id;
        this.dataOferta = dataOferta;
        this.volumeLitros = volumeLitros;
        this.precoNegociado = precoNegociado;
        this.status = status;
        this.sincronizado = sincronizado;
        this.atualizadoEm = atualizadoEm;
        this.receitas = receitas;
        this.produtor = produtor;
        this.laticinio = laticinio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDataOferta() {
        return dataOferta;
    }

    public void setDataOferta(LocalDate dataOferta) {
        this.dataOferta = dataOferta;
    }

    public double getVolumeLitros() {
        return volumeLitros;
    }

    public void setVolumeLitros(double volumeLitros) {
        this.volumeLitros = volumeLitros;
    }

    public double getPrecoNegociado() {
        return precoNegociado;
    }

    public void setPrecoNegociado(double precoNegociado) {
        this.precoNegociado = precoNegociado;
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

    public List<Receita> getReceitas() {
        return receitas;
    }

    public Produtor getProdutor() {
        return produtor;
    }

    public void setProdutor(Produtor produtor) {
        this.produtor = produtor;
    }

    public Laticinio getLaticinio() {
        return laticinio;
    }

    public void setLaticinio(Laticinio laticinio) {
        this.laticinio = laticinio;
    }
}
