package com.dio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Banco {

    public String nome;
    //banco é feito por set de contas
    protected Set<Conta> contas = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public Set<Conta> getContas() {
        return contas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setContas(Set<Conta> contas) {
        this.contas = contas;
    }
}
