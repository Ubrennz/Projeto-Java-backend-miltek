package com.projetomiltek.miltek.model;

import java.time.LocalDateTime;

public class Usuario {

    private int id;
    private int produtorId;
    private String nome;
    private String login;
    private String senha;
    private String perfil;
    private boolean sincronizado;
    private LocalDateTime atualizadoEm;

    public Usuario() {
    }

    public Usuario(int id, int produtorId, String nome, String login, String senha,
                    String perfil, boolean sincronizado, LocalDateTime atualizadoEm) {
        this.id = id;
        this.produtorId = produtorId;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
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
