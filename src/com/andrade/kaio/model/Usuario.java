package com.andrade.kaio.model;

import java.io.Serializable;

public class Usuario implements Serializable {

    private String nome, senha, email;

    public Usuario(String[] dados) {
        nome = dados[0];
        senha = dados[1];
        email = dados[2];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

