package com.dio.gof.singleton;

/**
 * Singleton preguiçoso
 *
 * @author thamnasc
 */

public class SingletonLazy {
    //não disponibiliza a instância num primeiro momento

    private static SingletonLazy instancia;

    //construtor privado garante que ninguém externamente vai conseguir instanciar
    private SingletonLazy() {
        super();
    }

    //instancia estática
    public static SingletonLazy getInstancia() {
        if(instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
