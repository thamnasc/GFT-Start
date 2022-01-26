package com.dio; //importa pacote

import com.dio.base.Order; //importa pedido

public class MyFirstProgram { //definir pacote da classe

    public static void main(String[] args) { //método principal que executa o programa
        //rede strings é o argumento
        final Order order = new Order("code1234");//instancia o pedido, cria uma variável do tipo "pedido"

        System.out.println(order); //este programa gera um pedido
        //criar uma classe que representa o pedido, dentro do pacote base
    }
}