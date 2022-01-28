package com.dio;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        float soma = 0, media;
        int count = 0;
        boolean temperaturaAcimaDaMedia = false;

        //lista para guardar temperaturas lidas
        List<Float> temperaturas = new ArrayList<Float>();
        //lista de meses
        List<String> meses = new ArrayList<String>() {{
            add("Janeiro");
            add("Fevereiro");
            add("Março");
            add("Abril");
            add("Maio");
            add("Junho");
        }};

        //entrada de dados e soma das temperaturas
        System.out.println("Informe a temperatura média dos 6 primeiros meses do ano: ");
        for(int i = 0; i < 6; i++) {
            float temperatura = scan.nextFloat();
            temperaturas.add(temperatura);
            soma += temperatura;
        }
        media = soma/temperaturas.size();
        System.out.printf("A média é %.1f graus Celsius.\n", media);

        //verificação de valores acima da média
        Iterator<Float> iterator = temperaturas.iterator();
        System.out.println("Os meses com temperatura acima da média foram: ");
        while(iterator.hasNext()) {
            Float next = iterator.next();
            if(next > media) {
                //imprime o mês correspondente ao valor acima da média, o count serve como index para a lista de meses
                System.out.println((count + 1) + " - " + meses.get(count) + " ");
                temperaturaAcimaDaMedia = true;
            }
            count++;
        }
        if(!temperaturaAcimaDaMedia) System.out.println("Nenhum");
    }
}
