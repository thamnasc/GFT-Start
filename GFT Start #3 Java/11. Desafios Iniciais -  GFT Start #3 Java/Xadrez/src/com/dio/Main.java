package com.dio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int C = sc.nextInt();

        //condicao de entrada
        boolean condicaoL = L >= 1 & L <= 1000;
        boolean condicaoC = C >= 1 & C <= 1000;

        //verifica se a linha de entrada é par
        boolean linhaPar = L % 2 == 0;

        //verifica se a coluna de entrada é ímpar
        boolean colunaPar = C % 2 == 0;

        if(condicaoL & condicaoC) {
            if(linhaPar){
                if(colunaPar) System.out.println("1"); //branco
                else System.out.println("0"); //preto
            } else { //linha impar
                if(colunaPar) System.out.println("0"); //preto
                else System.out.println("1"); //branco
            }
        }
        
        sc.close();
    }
}