package com.dio;

/*
        Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
        1. "Telefonou para a vítima?"
        2. "Esteve no local do crime?"
        3. "Mora perto da vítima?"
        4. "Devia para a vítima?"
        5. "Já trabalhou com a vítima?"
        Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
        "Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String resposta;
        int count = 0, respostaAfirmativa = 0;
        List<String> interrogatorio = new ArrayList<String>(){{
            add("Você telefonou para a vítima?");
            add("Esteve no local do crime?");
            add("Mora perto da vítima?");
            add("Devia para a vítima?");
            add("Já trabalhou com a vítima?");
        }};
        List<String> sentenca = new ArrayList<String>(Arrays.asList("Inocente.", "Inocente.",
                "Suspeita...", "Cúmplice!", "Cúmplice!", "Assassina :O!"));

        System.out.println("Você está sob suspeita de ter participado do assassinato de Fulano. Responda ao interrogatório! :@");
        System.out.println("Escreva S para \"sim\" e N para \"não\".");

        while(count < 5) {
            System.out.println(interrogatorio.get(count));
            resposta = (scan.nextLine()).toUpperCase();
            if(resposta.equals("S")) respostaAfirmativa++;
            count++;
        }

        System.out.println("A sua sentença é: " + sentenca.get(respostaAfirmativa));
    }
}
