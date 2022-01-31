/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.dio.operadoresaritmeticos;

/**
 *
 * @author thalita
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 3;
        int n2 = 5;
        float n = (n1 + n2) / 2;
        System.out.println("A média é igual a " + n);
        
        int numero = 5;
        int valor = 5 + numero++;
        System.out.println(valor);
        System.out.println(numero);
        
        int numero2 = 10;
        int valor2 = 4 + numero2--;
        System.out.println(valor2);
        System.out.println(numero2);
        
        int x = 4;
        x += 2;
        System.out.println(x);
        
        float pi = (float) Math.PI;
        System.out.println(pi);
        int number = 25;
        float res = (float) Math.sqrt(number);
        System.out.println(res);
        
        float y = 8.3f;
        int ar = (int) Math.round(y);
        System.out.println(ar);
        
        double ale = Math.random();
        //gerando número aleatório entre 10 e 5
        int number_ale = (int) (5 + ale * (10 - 5));
        System.out.println(number_ale);
       
    }
    
}
