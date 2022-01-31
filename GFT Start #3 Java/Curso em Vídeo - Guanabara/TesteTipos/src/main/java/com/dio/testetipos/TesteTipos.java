/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.dio.testetipos;

/**
 *
 * @author thalita
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade = 30;
        //ERRADO:::::::::
        //      String valor = idade;
        //typecasting não funciona
        //      String valor = (String) idade;
        //tem que fazer a conversão através de tipo invólucro
        String valor = Integer.toString(idade);
        System.out.println(valor);
        String valor2 = "30";
        //NÃO FUNCIONA:
        //      int idade = valor;
        //typecasting também não funciona
        int idade2 = Integer.parseInt(valor2);
        String valor3 = "30.5";
        float idade3 = Float.parseFloat(valor3);
        System.out.println(idade3);
        
        
        
    }
    
}
