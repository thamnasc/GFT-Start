package com.dio.base;

public class Order {

    private final String code;
    public Order(String code) { //método construtor
        this.code = code; //instancia, fala qual é o código, o atributo dentro da classe code recebe
        // o código do método construtor
    }
    //Override sobrescrito
    public String toString() { //método responsável por fazer a formatação da impressão do pedido, é um método sobescrito
        return "Order={" +
                "code='" + code + "'" +
                "}";
    }
}
