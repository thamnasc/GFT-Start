package com.dio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        int a = leitor.nextInt();
        int b = leitor.nextInt();

        System.out.println("X = " + (a+b));
    }
}