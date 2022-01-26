package com.dio;

public class Emprestimo {

    public static int getDuasParcelas() {
        return 2;
    }

    public static int getTresParcelas() {
        return 3;
    }

    public static double getTaxaDuasParcelas() {
        return 0.15;
    }

    public static double getTaxaTresParcelas() {
        return 0.35;
    }

    public static void calcular (double valor, int parcelas){

        if (parcelas == 2) {
            double valorFinal = (1 + getTaxaDuasParcelas()) * valor;
            System.out.println("O valor do empréstimo para 2 parcelas é " + valorFinal);
        } else if (parcelas == 3) {
            double valorFinal = (1 + getTaxaTresParcelas()) * valor;
            System.out.println("O valor do empréstimo para 3 parcelas é: " + valorFinal);
        } else {
            System.out.println("Quantidade de parcelas inválida.");
        }
    }
}
