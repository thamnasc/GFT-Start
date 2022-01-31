/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.dio.supercalculadora;

import java.util.Scanner;

/**
 *
 * @author thalita
 */
public class SuperCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int num = teclado.nextInt();
        float raizquad = (float) Math.sqrt(num);
        float raizcub = (float) Math.cbrt(num);
        System.out.println("A raiz quadrada é: " + raizquad);
        System.out.println("A raiz cúbica é: " + raizcub);
        int potencia = (int) Math.pow(num, 2);
        System.out.println("Elevado ao quadrado é: " + potencia);
       
        
        
    }
    
}
