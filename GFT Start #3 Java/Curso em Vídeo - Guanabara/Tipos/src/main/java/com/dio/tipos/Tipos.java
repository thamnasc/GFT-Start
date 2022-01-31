/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.dio.tipos;
import java.util.Scanner;
/**
 *
 * @author thalita
 */
public class Tipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* float nota = (float) 8.5;
        *  String nome = "Thali";
        *  System.out.println("A nota é: " + nota);
        *  System.out.printf("Sua nota de %s é %.2f\n", nome, nota);
        *  System.out.format("Sua nota é %.2f", nota);
        */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.println("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        
        //int idade = teclado.nextInt();
        //float salario = teclado.nextFloat();
        //String nome = teclado.nextLine();
        
}
    
}
