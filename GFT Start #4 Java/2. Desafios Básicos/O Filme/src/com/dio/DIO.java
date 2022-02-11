package com.dio;

import java.io.IOException;
import java.util.Scanner;

public class DIO {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        double porcentagem;

        double A = leitor.nextDouble();
        double B = leitor.nextDouble();

        // 20 30 (A B) --> diferença de 10 (B - A = 10)
        // 10/20 (A/B) --> 0.5 --> 0.5 * 100 --> 50.00%
        porcentagem = (B - A) / A * 100;

        System.out.printf("%.2f", porcentagem);
        System.out.println("%");
    }
}