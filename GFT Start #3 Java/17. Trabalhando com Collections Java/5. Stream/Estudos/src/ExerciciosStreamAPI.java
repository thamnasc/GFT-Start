import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExerciciosStreamAPI {
    public static void main(String[] args) {

        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
        numerosAleatorios.stream().forEach(System.out::println);

        //Consumer é uma interface funcional
        numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //lambda
        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");
//        numerosAleatorios.stream()
//                .limit(5)
//                .collect(Collectors.toSet())
//                .forEach(System.out::println); //não imprime número repetidos, porque set não aceita
        Set<String> collectSet = numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet());

        System.out.println("Transforme esta lista String em uma lista de números inteiros:");
//        numerosAleatorios.stream()
//                .map(new Function<String, Integer>() {
//                    @Override
//                    public Integer apply(String s) {
//                        return Integer.parseInt(s);
//                    }
//                }); //não é map de collections

        //lambda
        numerosAleatorios.stream()
                .map(s -> Integer.parseInt(s));

        //stream
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista: ");
//        numerosAleatorios.stream()
//                .map(Integer::parseInt)
//                .filter(new Predicate<Integer>() {
//                    @Override
//                    public boolean test(Integer i) {
//                        if(i %2 == 0 && i > 2) return true;
//                        return false;
//                    }
//                }).collect(Collectors.toList());

        //colocando numa variável, para melhor visualização
//        List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
//                .map(Integer::parseInt)
//                .filter(new Predicate<Integer>() {
//                    @Override
//                    public boolean test(Integer i) {
//                        if(i %2 == 0 && i > 2) return true;
//                        return false;
//                    }
//                }).collect(Collectors.toList());

        //lambda
        List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i %2 == 0 && i > 2)).collect(Collectors.toList());
        System.out.println(listParesMaioresQue2);

        System.out.println("Mostre a média dos números: ");
//        numerosAleatorios.stream()
//                .mapToInt(new ToIntFunction<String>() {
//                    @Override
//                    public int applyAsInt(String s) {
//                        return Integer.parseInt(s);
//                    }
//                });
        //lambda
        numerosAleatorios.stream()
                .mapToInt(s -> Integer.parseInt(s));
        //stream
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(new DoubleConsumer() {
                    @Override
                    public void accept(double v) {
                        System.out.println(v);
                    }
                });
        //lambda
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(v -> System.out.println(v));
        //stream
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remova os números ímpares: ");
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //método de list
//        numerosAleatorios.removeIf(new Predicate<String>() {
//            @Override
//            public boolean test(Integer integer) {
//                if(integer % 2 != 0) return true;
//                return false;
//            }
//        });

        //lambda
        numerosAleatoriosInteger.removeIf(i -> (i %2 != 0));
        System.out.println(numerosAleatoriosInteger);

        //        Para você
//        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
//
//        System.out.println("Retirando os números repetidos da lista, quantos números ficam? ");
//
//        System.out.print("Mostre o menor valor da lista: ");
//
//        System.out.print("Mostre o maior valor da lista: ");
//
//        System.out.println("Pegue apenas os números ímpares e some: ");
//
//        System.out.println("Mostre a lista na ordem númerica: ");
//
//        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
    }
}

