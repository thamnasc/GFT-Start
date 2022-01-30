package com.dio.gof.singleton;

/**
 * Singleton apressado
 *
 * @author thamnasc
 */

public class SingletonEager {
    //no momento que a varíavel estática é definida, já atribui a instância
    private static SingletonEager instancia = new SingletonEager();

    //construtor privado garante que ninguém externamente vai conseguir instanciar
    private SingletonEager() {
        super();
    }

    //a instância já está pronta para ser retornada
    public static SingletonEager getInstancia() {
        return instancia;
    }
}
