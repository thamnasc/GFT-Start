package com.dio;

public class Main {

    public static void main(String[] args) {

        System.out.println("Calculadora:");
        Calculadora.soma(5, 2);
        Calculadora.subtracao(7, -3);
        Calculadora.divisao(5, 2);
        Calculadora.multiplicacao(0, 5);

        System.out.println("Mensagem:");
        Mensagem.mensagem(5);
        Mensagem.mensagem(2);
        Mensagem.mensagem(19);
        Mensagem.mensagem(13);

        System.out.println("Emprestimo: ");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1500.54d, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1500.54d, 6);

    }
}
