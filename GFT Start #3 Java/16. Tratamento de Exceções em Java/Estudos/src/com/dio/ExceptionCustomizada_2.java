package com.dio;

import javax.swing.*;

public class ExceptionCustomizada_2 {
    public static void main(String[] args){
        //exceptins: divisão por zero e erro de index fora do definido
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        //não é lançada a exceção, porque está dentro do método main
        //é criada uma classe por fora para a Exception Customizada
        for (int i = 0; i < denominador.length; i++) {
            try {
                if(numerador[i] %2 != 0) //throw é usado para Exception Customizada
                    throw new DivisaoNaoExataException("Divisão não exata!", numerador[i], denominador[i]);

                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            } catch (DivisaoNaoExataException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }

        System.out.println("O programa continua...");
    }
}

