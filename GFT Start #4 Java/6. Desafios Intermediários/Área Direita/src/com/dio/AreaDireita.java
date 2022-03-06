package com.dio;

import java.io.IOException;
import java.util.Scanner;

public class AreaDireita {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        char O = leitor.next().toUpperCase().charAt(0);
        int metadeLinhas = 6;
        double[][] M = new double[12][12];

        //leitura da matriz
        for(int i = 0; i < M.length; i++) {
            for(int j = 0; j < M[i].length; j++) {

                M[i][j] = leitor.nextDouble();

                //se j for maior que os j da diagonal secundária (última coluna - i)
                boolean maiorQDiagonalSec = j > (M[i].length - 1 - i);
                boolean maiorQDiagonalPri = j > i;

                if(maiorQDiagonalSec && i < metadeLinhas)
                    soma += M[i][j];
                else if(maiorQDiagonalPri && i >= metadeLinhas)
                    soma += M[i][j];
            }
        }

        if(O == 'M') soma /= 30;
        System.out.println(String.format("%.1f", soma));
    }
}