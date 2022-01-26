package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero, fatorial = 1;

        System.out.println("Informe o fatorial que deseja: ");
        numero = scan.nextInt();

        if(numero == 0) System.out.println("0! = 1");
        else if(numero > 0) {
            for(int i = 1; i <= numero; i++)
                fatorial *= i;
            System.out.println(numero + "!= " + fatorial);
        } else System.out.println("Número inválido.");
    }
}
