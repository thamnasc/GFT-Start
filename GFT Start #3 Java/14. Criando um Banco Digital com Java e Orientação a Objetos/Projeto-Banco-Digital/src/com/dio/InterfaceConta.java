package com.dio;

public interface InterfaceConta {

    //colocar public no método da interface é uma redundância
    void sacar(double valor);

    void depositar(double valor);

    //polimorfismo --> esperando que seja passada uma contaDestino
    void transferir(double valor, Conta contaDestino);

    //não obriga a classe abstrata a implementar,
    //mas obriga as classes filhas
    void imprimirInformacoes();

}
