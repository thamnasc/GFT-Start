package com.dio;

public class Main {

    public static void main(String[] args) {
        //aprendendo sobre sobrecarga e retorno
        System.out.println("Exercício quadrilátero: ");
        System.out.println("A área do quadrado é: " + Quadrilatero.area(5.1));
        System.out.println("A área do retângulo é: " + Quadrilatero.area(5d, 2d));
        System.out.println("A área do trapézio é: " + Quadrilatero.area(3, 5, 2));
        //na hora de chamar o método, a diferença é feita pelo tipo de dado entre retângulo e losango
        System.out.println("A área do losango é: " + Quadrilatero.area(5f, 2f));
    }
}
