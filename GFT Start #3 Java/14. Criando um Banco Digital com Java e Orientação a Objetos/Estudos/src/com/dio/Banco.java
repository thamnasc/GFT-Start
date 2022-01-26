package com.dio;

import java.util.List;

public class Banco {

    public String nome;
    //banco é feito por lista de contas
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
