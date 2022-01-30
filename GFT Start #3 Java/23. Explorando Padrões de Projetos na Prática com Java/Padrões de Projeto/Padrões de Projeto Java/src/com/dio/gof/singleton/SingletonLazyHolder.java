package com.dio.gof.singleton;

/**
 * Singleton Lazy Holder
 *
 * @author thamnasc
 */

//é thread safe
public class SingletonLazyHolder {

    //encapsula a instância numa classe estática interna
    private static class InstanceHolder {
        //instância precisa ser pública para se ter acesso
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    //retorna através do InstanceHolder
    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}
