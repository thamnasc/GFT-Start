package com.dio;

//a classe não pode ser instanciada
public abstract class Conteudo {

    //static acessa o XP_PADRAO fora da classe
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double calcularXp() {
        return XP_PADRAO + 5d;
    }
}
