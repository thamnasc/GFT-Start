package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParEImpar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros, count = 0, numero, quantidadePar = 0, quantidadeImpar = 0;

        System.out.println("Informa a quantidade de números: ");
        quantidadeNumeros = scan.nextInt();

        while(count < quantidadeNumeros) {
            System.out.println("Digite o número: ");
            numero = scan.nextInt();
            if(numero % 2 == 0) quantidadePar += 1;
            else quantidadeImpar += 1;
            count++;
        }
        System.out.println("A quantidade de pares é: " + quantidadePar);
        System.out.println("A quantidade de ímpares é: " + quantidadeImpar);

    }
}
