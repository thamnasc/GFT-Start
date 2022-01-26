package com.dio;

import javax.swing.*;

//Fazer a divisão de 2 valores inteiros
public class UncheckedException {
    public static void main(String[] args) {

        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try{
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                //e.printStackTrace();
                JOptionPane.showMessageDialog(null, "It's not a possible operation. " + e.getLocalizedMessage());
            } catch (ArithmeticException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Impossible operation. You're trying to divide 0" + a + e.getLocalizedMessage());
            }
            //não é necessário usar o finally
            finally {
                System.out.println("Chegou no finally!");
            }
        } while(continueLooping);

        System.out.println("O código continua...");
    }

    public static int dividir(int a, int b) {
        return a / b;
    }

    //comentário importante: tentei transformar em float os valores de entrada e não entra no catch, retorna "Infinity"
}
