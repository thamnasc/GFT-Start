package com.dio;

import java.io.IOException;
import java.util.Scanner;
import static java.lang.Math.abs;

public class DIO {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        double numero;
        int expoente = 0;
        numero = leitor.nextDouble();

        String numeroString = Double.toString(numero);
        boolean expPositivo = abs(numero) >= 1 || numero == 0;

        while(abs(numero) >= 10) {
            expoente++;
            numero /= 10;
        }

        while(abs(numero) < 1 && numero != 0) {
            expoente++;
            numero *= 10;
        }

        if(numeroString.charAt(0) != '-') System.out.print("+");
        System.out.printf("%.4fE", numero);
        if(expPositivo) System.out.print("+");
        else System.out.print("-");
        if(expoente < 10) System.out.print("0");
        System.out.printf("%d", abs(expoente));
    }
}