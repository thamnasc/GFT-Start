package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero, soma = 0, maior, count = 0;

        System.out.println("Numero: ");
        numero = scan.nextInt();
        maior = numero;
        soma += numero;

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            if (numero > maior)
                maior = numero;
            count ++;
            soma += numero;
        } while(count < 4);
        System.out.println("A media é: " + ((float) soma/5));
        System.out.println("O maior número é: " + maior);
    }
}
