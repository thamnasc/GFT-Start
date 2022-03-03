package com.dio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double N;
        int quociente, reais;
        int[] notas = {100,50,20,10,5,2};
        int[] moedas = {100,50,25,10,5,1};

        N = sc.nextDouble();
        reais = (int) (N * 100);

        System.out.println("NOTAS:");

        for (int nota : notas) {
            quociente = reais / (nota * 100);
            reais %= (nota * 100);
            System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
        }

        System.out.println("MOEDAS:");

        for (int moeda : moedas) {
            quociente = reais / (moeda);
            reais %= moeda;
            System.out.print(quociente + " moeda(s) de R$ ");
            System.out.printf("%.2f\n", (float) moeda/100);
        }

        sc.close();
    }
}