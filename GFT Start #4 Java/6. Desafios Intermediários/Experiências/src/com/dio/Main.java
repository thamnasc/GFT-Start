package com.dio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char c, percent = '%';
        double total = 0, coelho = 0, rato = 0, sapo = 0, standby = 0;
        double coelhoPerc, ratoPerc, sapoPerc;
        int n=input.nextInt();

        for(int i = 0; i < n; i++) {
            total += standby = input.nextInt();
            c = input.next().toUpperCase().charAt(0);
            if(c == 'C') coelho += standby;
            else if(c == 'S') sapo += standby;
            else if(c == 'R') rato += standby;
        }

        coelhoPerc = coelho / total * 100;
        ratoPerc = rato / total * 100;
        sapoPerc = sapo / total * 100;

        System.out.printf("Total: %.0f cobaias\n", total);
        System.out.printf("Total de coelhos: %.0f\n", coelho);
        System.out.printf("Total de ratos: %.0f\n", rato);
        System.out.printf("Total de sapos: %.0f\n", sapo);
        System.out.format("Percentual de coelhos: %.2f %s%n", coelhoPerc, percent);
        System.out.format("Percentual de ratos: %.2f %s%n", ratoPerc, percent);
        System.out.format("Percentual de sapos: %.2f %s%n", sapoPerc, percent);
    }
}