package com.dio;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        //instanciando objeto Scanner para leitura de dados
        Scanner sc = new Scanner(System.in);

        double A, B, media;

        //entrada de dados
        A = sc.nextDouble();
        B = sc.nextDouble();

        //calculando a média
        media = (A * 3.5 + B * 7.5)/11;

        //imprimindo e pulando uma linha
        System.out.printf("MEDIA = %.5f\n", media);
    }
}