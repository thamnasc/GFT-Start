package com.dio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x1,y1,x2,y2;
        //se estiver na mesma linha ou mesma coluna ou mesma diagonal, gasta 1 movimento
        //se estiver em qualquer outra posição, a rainha gastará 2 movimentos!

        while(true){
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();

            //condições
            boolean encerraPrograma = x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0;
            boolean posicaoAtual = x1 == x2 && y1 == y2;
            boolean linhaDiferente = x1 != x2;
            boolean colunaDiferente = y1 != y2;
            boolean linhaColunaDiferentes = x1 != x2 && y1 != y2;
            //se a diferença em módulo for igual entre linhas e colunas ao se movimentar, o movimento é na diagonal
            //o módulo é necessário porque, por exemplo  4 4 6 2
            // 4 - 6 = -2 e 4 -2 = 2, para colunas, o valor inicial era maior, enquanto para linhas era o contrário
            //o módulo, portanto, não se preocupa com a direção do movimento
            boolean diagonal = Math.abs(x1 - x2) == Math.abs(y1 - y2);

            if(encerraPrograma) break; //condição de parada
            if(posicaoAtual)
                System.out.println(0);
            else if(diagonal)
                System.out.println(1);
            else if(linhaColunaDiferentes)
                System.out.println(2);
            else if(linhaDiferente || colunaDiferente)
                System.out.println(1);
        }
        sc.close();
    }
}