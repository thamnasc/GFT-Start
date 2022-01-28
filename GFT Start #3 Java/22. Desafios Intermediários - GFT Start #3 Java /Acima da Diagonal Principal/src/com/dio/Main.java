package com.dio;

import java.io.IOException;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        float[][] matriz = new float[12][12];
        float soma = 0, cedulas = 0;
        String operacao;

        operacao = leitor.nextLine();

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = leitor.nextFloat();
                if(j > i) {
                    soma += matriz[i][j];
                    cedulas ++;
                }
            }
        }

        if(operacao.equals("S")) System.out.printf("%.1f", soma);
        else if(operacao.equals("M")) System.out.printf("%.1f", soma/cedulas);
    }
}
