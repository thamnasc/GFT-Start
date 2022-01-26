package com.dio;

import java.io.IOException;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int senha;

        do {
            senha = leitor.nextInt();
            if(senha != 2002) System.out.println("Senha Invalida");
        } while(senha != 2002);

        System.out.println("Acesso Permitido");
    }
}