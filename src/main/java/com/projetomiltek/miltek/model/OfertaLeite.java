package com.projetomiltek.miltek.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "oferta_leite")
public class OfertaLeite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int produtorId;
    private int laticinioId;
    private LocalDate dataOferta;
    private double volumeLitros;
    private double precoNegociado;
    private String status;
    private boolean sincronizado;
    private LocalDateTime atualizadoEm;

    public OfertaLeite() {
    }

    public OfertaLeite(int id, int produtorId, int laticinioId, LocalDate dataOferta,
                        double volumeLitros, double precoNegociado, String status,
                        boolean sincronizado, LocalDateTime atualizadoEm) {
        this.id = id;
        this.produtorId = produtorId;
        this.laticinioId = laticinioId;
        this.dataOferta = dataOferta;
        this.volumeLitros = volumeLitros;
        this.precoNegociado = precoNegociado;
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

    public int getProdutorId() {
        return produtorId;
    }

    public void setProdutorId(int produtorId) {
        this.produtorId = produtorId;
    }

    public int getLaticinioId() {
        return laticinioId;
    }

    public void setLaticinioId(int laticinioId) {
        this.laticinioId = laticinioId;
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
}
