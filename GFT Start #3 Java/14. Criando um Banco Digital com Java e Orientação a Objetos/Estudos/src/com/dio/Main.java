package com.dio;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean continuaExecucao = true;
        String entradaAlfanumerica;
        int entradaNumerica;

        System.out.println("Bem-vindo ao Banco Digital Dio.");

        while(continuaExecucao) {
            System.out.println("Selecione a ação que deseja realizar. ");
            System.out.println("=== Tabela de Opções ===");
            System.out.println("1            Criar Conta");
            //System.out.println("2         Logar na Conta");
            System.out.println("3                   Sair");
            entradaNumerica = scan.nextInt();

            if(entradaNumerica == 3) {
                System.out.println("Encerrando....");
                continuaExecucao = false;
            }

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
                System.out.println("Cadastro concluído com sucesso.");
            }

           /* Cliente thalita = new Cliente();
            thalita.setNome("Thalita Nascimento");
            thalita.setIdade(21);
            thalita.setNumeroCpf("000.000.000-00");

            Conta contaCorrente1 = new ContaCorrente(thalita);
            Conta contaPoupanca1 = new ContaPoupanca(thalita);

            contaCorrente1.imprimirInformacoes();
            contaPoupanca1.imprimirInformacoes();

            contaCorrente1.depositar(500);
            contaCorrente1.transferir(300, contaPoupanca1);

            contaCorrente1.imprimirInformacoes();
            contaPoupanca1.imprimirInformacoes();*/
        }
    }
}
