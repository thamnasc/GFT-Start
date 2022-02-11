package com.dio;

import java.util.Scanner;

public class Classe{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double area, raio;
        final double PI = 3.14159;

        raio = scan.nextDouble();

        area = PI * (Math.pow(raio,2));

        System.out.printf("A=%.4f\n", area);
    }
}