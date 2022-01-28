package com.dio;

import java.util.*;

class ExemploList {
    public static void main(String[] args) {

        /* Dada uma lista com 7 notas de um alunos [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
         */
        System.out.println("Crie uma lista e adiciona as sete notas: ");

        //anterior ao java 5
//        List notas = new ArrayList();

        //Generics (jdk 5) <Double>;
//        List<Double> notas = new ArrayList<>();
        // java 7 (jdk) diamond operator <>, não precisa repetir o Double depois

//        ArrayList<Double> notas = new ArrayList<>(); //ArrayList é a interface, mas é recomendado programar voltado
        //para a implementação, então não é a melhor maneira

//        List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        //inicia com a implementação ArrayList

//        List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        //passa direto para a List o Array asList; esta forma é válida, mas é limitada, porque
        //não é possível de aumentar a List ou retirar elementos

//        List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
//        //torna a lista imutável
//        notas.add(1d);
//        notas.remove(5d);
//        System.out.println(notas);

        List<Double> notas = new ArrayList<Double>();

        //método mais convencial para adicionar elementos é add, mas é possível de adicionar com asList
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        //System.out.println(notas);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: " );
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        //em List, os elementos se mantém na ordem em que foram adicionados
        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        for (Double nota : notas) System.out.println(nota);

        //passar a posição e receber o elemento
        System.out.println("Exiba a terceira nota adiciona: " + notas.get(2));
        System.out.println(notas.toString()); //para conferir

        //Classe Double implementa Comparable, que é utilizado para verificar os números
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        //verifica se há um próximo elemento, começa a verificar no index 0
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        //size() retorna quantidade de elementos que há na lista
        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d); //passa o objeto, mas pode passar o índice
        //a posição é passada com o valor em inteiro
        System.out.println(notas);

        System.out.println("Remova a nota 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        /*System.out.println("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);*/

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

        /*Exercícios: utilize os métodos da implementação LinkedList
         */

        System.out.println("Crie uma lista chamada notas2 " +
                "e coloque todos os elementos da list Arraylist nessa nova lista: ");
        //assim não precisa fazer casting transformando em double
        //LinkedList notas2 = new LinkedList();

        List<Double> notas2 = new LinkedList<Double>(notas);
        //Collections.copy(notas, notas2); assim não passou os elementos, ficou nulo, então passei notas como argumento acima
        System.out.println(notas2);

        System.out.println("Mostre a primeira nota da nova lista sem a remover: " + ((LinkedList<Double>) notas2).getFirst());

        System.out.println("Mostre a primeira nota da nova lista removendo-o: " + ((LinkedList<Double>) notas2).poll());
        System.out.println(notas2);
    }
}