package com.dio;

import java.util.Scanner;

public class Problem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] TOPS = {1, 3, 5, 10, 25, 50, 100};
        int categoria = 0;

        int posicao = scan.nextInt();
        boolean condicaoDeEntrada = 1 <= posicao & posicao <= 100;

        if(condicaoDeEntrada) {
            while (posicao > TOPS[categoria]) {
                categoria++;
            }
            System.out.println("Top " + TOPS[categoria]);
        }
    }
}
