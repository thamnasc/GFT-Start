package com.dio;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        int X, Y;
        float preco = 0;

        Scanner input = new Scanner(System.in);
        X = input.nextInt();
        Y = input.nextInt();

        switch(X) {
            case 1: //cachorro quente
                preco = (float) (4.00 * Y);
                break;
            case 2: //X-salada
                preco = (float) (4.50 * Y);
                break;
            case 3: //X-bacon
                preco = (float) (5.00 * Y);
                break;
            case 4: //torrada simples
                preco = (float) (2.00 * Y);
                break;
            case 5: //refrigerante
                preco = (float) (1.50 * Y);
                break;
            default:
                break;
        }

        System.out.printf("Total: R$ %.2f\n",preco);
    }
}
