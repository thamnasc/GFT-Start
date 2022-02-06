package com.dio;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        //instanciando Scanner
        Scanner scan = new Scanner(System.in);

        int N;

        //entrada de dados
        N = scan.nextInt();

        for(int i = 2; i <= N; i++) {
            //verifica se o número é par
            if(i % 2 == 0) System.out.println(i);
        }
    }
}

