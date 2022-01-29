package com.dio;

//ContaPoupanca herda Conta
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    //decidi manter os métodos separadaos entre as contas para
    //verificar como funciona uma classe mãe abstrata com interface
    //CPF e Idade não são exibidos na hora de imprimir o extrato
    @Override
    public void imprimirInformacoes() {
        System.out.println("\n---- Extrato Conta Poupança ---- ");
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", super.agencia));
        System.out.println(String.format("Numero: %d", super.numero));
        System.out.println(String.format("Saldo: %.2f", super.saldo));
    }

}
