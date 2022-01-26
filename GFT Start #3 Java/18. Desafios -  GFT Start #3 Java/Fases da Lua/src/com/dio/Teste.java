package com.dio;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int inicio = leitor.nextInt();
        int fim = leitor.nextInt();

        boolean luaNova = inicio >= 0 && fim <= 2;
        boolean luaCrescente = inicio >= 2 && fim <= 96 && fim > inicio;
        boolean luaMinguante = inicio <= 97 && fim >= 3 && fim < inicio;
        boolean luaCheia = inicio >= 95 && fim <= 100;

        if(luaNova)
            System.out.println("nova");
        else if(luaCrescente)
            System.out.println("crescente");
        else if(luaMinguante)
            System.out.println("minguante");
        else if(luaCheia)
            System.out.println("cheia");
    }
}
