package com.dio;

//ContaCorrente herda Conta
public class ContaCorrente extends Conta {

    //construtor diferente do padrão, a classe mãe obriga que as filhas criem construtores
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }
    @Override
    public void imprimirInformacoes() {
        System.out.println("\n---- Extrato Conta Corrente ---- ");
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", super.agencia));
        System.out.println(String.format("Numero: %d", super.numero));
        System.out.println(String.format("Saldo: %.2f", super.saldo));
    }

}

