package com.projetomiltek.miltek.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "receita")
public class Receita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int produtorId;
    private Integer ofertaId;
    private double valor;
    private LocalDate data;
    private String descricao;
    private boolean sincronizado;
    private LocalDateTime atualizadoEm;

    @ManyToOne
    @JoinColumn(name = "produtor_id")
    private Produtor produtor;

    @ManyToOne
    @JoinColumn(name = "oferta_leite_id")
    private OfertaLeite ofertaLeite;

    public Receita() {
    }

    public Receita(int id, int produtorId, Integer ofertaId, double valor, LocalDate data, String descricao, boolean sincronizado, LocalDateTime atualizadoEm, Produtor produtor, OfertaLeite ofertaLeite) {
        this.id = id;
        this.produtorId = produtorId;
        this.ofertaId = ofertaId;
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
        this.sincronizado = sincronizado;
        this.atualizadoEm = atualizadoEm;
        this.produtor = produtor;
        this.ofertaLeite = ofertaLeite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProdutorId() {
        return produtorId;
    }

    public void setProdutorId(int produtorId) {
        this.produtorId = produtorId;
    }

    public Integer getOfertaId() {
        return ofertaId;
    }

    public void setOfertaId(Integer ofertaId) {
        this.ofertaId = ofertaId;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    public Produtor getProdutor() {
        return produtor;
    }

    public void setProdutor(Produtor produtor) {
        this.produtor = produtor;
    }

    public OfertaLeite getOfertaLeite() {
        return ofertaLeite;
    }

    public void setOfertaLeite(OfertaLeite ofertaLeite) {
        this.ofertaLeite = ofertaLeite;
    }
}
