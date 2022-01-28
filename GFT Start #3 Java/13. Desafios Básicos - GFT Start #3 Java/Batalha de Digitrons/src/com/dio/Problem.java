package com.dio;

import java.io.IOException;
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        int T = leitor.nextInt();
        int B, A1, D1, L1, A2, D2, L2, V1 = 0, V2 = 0;
        
        for (int i = 0; i < T; i++) {
            B = leitor.nextInt();
            A1 = leitor.nextInt();
            D1 = leitor.nextInt();
            L1 = leitor.nextInt();
            A2 = leitor.nextInt();
            D2 = leitor.nextInt();
            L2 = leitor.nextInt();

            //condicao de entrada
            boolean condicaoB = 0 <= B & B <= 100;
            boolean condicaoA1 = 1 <= A1;
            boolean condicaoD1 = D1 <= 100;
            boolean condicaoL1 = 1 <= L1 & L1 <= 50;
            boolean condicao1 = condicaoB & condicaoA1 & condicaoD1 & condicaoL1;
            boolean condicaoA2 = 1 <= A1;
            boolean condicaoD2 = D1 <= 100;
            boolean condicaoL2 = 1 <= L1 & L1 <= 50;
            boolean condicao2 = condicaoB & condicaoA2 & condicaoD2 & condicaoL2;

            //operaador condicional ternário para o bônus
            if(condicao1) V1 = (A1 + D1)/2 + (L1 % 2 == 0 ? B : 0);
            if(condicao2) V2 = (A2 + D2)/2 + (L2 % 2 == 0 ? B : 0);

            //quem tiver maior valor do golpe, ganha
            if(V1 > V2) System.out.println("Bruno");
            else if(V1 < V2) System.out.println("Guarte");
            else System.out.println("Empate");
        }
    }
}