package com.dio;

public class Main {
    public static void main(String[] args) {

        int i;
        //int i; //já foi criada, não pode ser criada de novo
        int I; //Java é case sensitive
        //int 1a; //inválida
        int _1a; //fere boas práticas
        int $aq; //fere boas práticas

        //variáveis devem ser inicializadas
        i = 2;
        I = 2;
        _1a = 3;
        $aq = 7;

        final int j = 10; //esta variável não pode mudar de valor
        //int j = 8;
        int asrn245678ad; //não é usual
        //int asrn246 78md; //erro, não pode haver espaço
        int asrn2$4678_ad = 10; //não é boa prática
//      int asrn2$4678%ad = 10; //erro, não pode usar %, é caracter inválido

        /* variáveis bem definidas */
        int quantidadeProduto =50;
//       int QuantidadeProduto; // não é boa prática
//        final int NUMERO_TENTATIVAS = 5;
//        final int numeroTentativas = 5; //não é boa prática
//        int QUANTIDADE_OPCOES = 25; //não é uma boa prática
//        int qtdProd; //a expressividade não foi aplicada

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);
    }
}