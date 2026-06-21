package com.projetomiltek.miltek.model;

import jakarta.persistence.*;
import org.hibernate.annotations.ManyToAny;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "despesa")
public class Despesa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int produtorId;
    private String categoria;
    private String descricao;
    private double valor;
    private LocalDate data;
    private boolean sincronizado;
    private LocalDateTime atualizadoEm;

    @ManyToOne
    @JoinColumn(name = "produtor_id")
    private Produtor produtor;

    public Despesa() {
    }

    public Despesa(int id, int produtorId, String categoria, String descricao, double valor, LocalDate data, boolean sincronizado, LocalDateTime atualizadoEm, Produtor produtor) {
        this.id = id;
        this.produtorId = produtorId;
        this.categoria = categoria;
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
        this.sincronizado = sincronizado;
        this.atualizadoEm = atualizadoEm;
        this.produtor = produtor;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
}
