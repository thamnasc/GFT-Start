package com.dio;

public class Cliente {

    protected String nome;
    protected String numeroCpf;
    protected int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroCpf() {
        return numeroCpf;
    }

    public int getIdade() {
        return idade;
    }
}
