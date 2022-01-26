package com.dio;

public class Calculadora {

    //public --> visibilidade
    //static --> modificador
    //void --> retorno
    //soma --> nome do metodo
    public static void soma(int a, int b) {
        int resultado = a + b;
        System.out.println("a soma é: " + resultado);
    }

    public static void subtracao(int a, int b) {
        int resultado = a - b;
        System.out.println("a subtracao é: " + resultado);
    }

    public static void divisao(int a, int b) {
        float resultado = (float) a / b;
        System.out.println("a divisao é: " + resultado);
    }

    public static void multiplicacao(int a, int b) {
        int resultado = a * b;
        System.out.println("a multiplicacao é: " + resultado);
    }
}
