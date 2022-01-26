package br.com.dio.exercicios.arrays;

import java.util.Scanner;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetor = {8, -5, 15, 50, 8, 4};

        /*for(int i = 5; i >= 0; i--) {
            System.out.println(vetor[i]);
        }*/
        int count = 1;
        while(count <= (vetor.length)) {
            System.out.println(vetor[vetor.length - count]);
            count++;
        }


    }
}
