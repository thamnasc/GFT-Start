package com.dio;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean continuaExecucao = true;
        String entradaAlfanumerica;
        int entradaNumerica;
        double dinheiro;

        Banco banco = new Banco();
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Cliente DIO");
        cliente1.setIdade(30);
        cliente1.setNumeroCpf("000.000.000-00");
        Conta contaPoupanca = new ContaPoupanca(cliente1);

        System.out.println("Bem-vindo ao Banco Digital Dio.");

        System.out.println("Selecione a ação que deseja realizar. ");
        System.out.println("=== Tabela de Opções ===");
        System.out.println("1            Criar Conta");
        System.out.println("2                   Sair");
        entradaNumerica = scan.nextInt();

        if(entradaNumerica == 2)
            System.out.println("Encerrando....");

        if(entradaNumerica == 1) {

            Cliente cliente = new Cliente();
            System.out.print("Informe seu nome completo: ");
            entradaAlfanumerica = scan.next();
            cliente.setNome(entradaAlfanumerica);
            System.out.print("Informe sua idade: ");
            entradaNumerica = parseInt(scan.next());
            cliente.setIdade(entradaNumerica);
            System.out.print("Informe seu CPF: ");
            entradaAlfanumerica = scan.next();
            cliente.setNumeroCpf(entradaAlfanumerica);
            Conta contaCorrente = new ContaCorrente(cliente);
            System.out.println("Cadastro concluído com sucesso. Você está logado em sua conta.");

            while(true) {

                System.out.println("\nSelecione a ação que deseja realizar. ");
                System.out.println("=== Tabela de Opções ===");
                System.out.println("1              Depositar");
                System.out.println("2                  Sacar");
                System.out.println("3             Transferir");
                System.out.println("4 Visualizar Informações");
                System.out.println("5                   Sair");
                entradaNumerica = scan.nextInt();

                if(entradaNumerica == 1) {
                    System.out.println("Digite o valor a ser depositado: ");
                    dinheiro = scan.nextDouble();
                    contaCorrente.depositar(dinheiro);
                }

                if(entradaNumerica == 2) {
                    if(contaCorrente.getSaldo() == 0) System.out.println("Você está sem saldo.");
                    else {
                        System.out.println("Digite o valor a ser sacado: ");
                        dinheiro = scan.nextDouble();
                        contaCorrente.sacar(dinheiro);
                    }
                }

                if(entradaNumerica == 3) {
                    if(contaCorrente.getSaldo() == 0) System.out.println("Você está sem saldo.");
                    else {
                        System.out.println("Digite o valor a ser transferido: ");
                        dinheiro = scan.nextDouble();
                        contaCorrente.transferir(dinheiro, contaPoupanca);
                    }
                }

                if(entradaNumerica == 4) contaCorrente.imprimirInformacoes();

                if(entradaNumerica == 5) {
                    System.out.println("Encerrando....");
                    break;
                }
            }
        }
    }
}
