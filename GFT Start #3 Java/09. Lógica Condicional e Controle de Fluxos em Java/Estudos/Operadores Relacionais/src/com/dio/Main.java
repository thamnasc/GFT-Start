package com.dio;

public class Main {

    public static void main(String[] args) {

        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        char c1 = 't';
        char c2 = 'h';
        String s1 = "Thalita";
        String s2 = "Nascimento";
        boolean b1 = true;
        boolean b2 = false;

        long l1 = 1456L;
        long l2 = 4567L;
        byte y1 = 1;
        short h1 = 24;

        System.out.println("i1 == i2? " + (i1 == i2));
        System.out.println("i1 != i2? " + (i1 != i2));
        System.out.println("i1 >= i2? " + (i1 >= i2));
        System.out.println("i1 <= i2? " + (i1 <= i2));

        System.out.println("f1 == f1? " + (f1 == f2));
        System.out.println("f1 != f1? " + (f1 != f2));
        System.out.println("f1 >= f1? " + (f1 >= f2));
        System.out.println("f1 <= f1? " + (f1 <= f2));

        System.out.println("c1 == c2 " + (c1 == c2));
        System.out.println("c1 != c2 " + (c1 != c2));
        System.out.println("c1 >= c2 " + (c1 >= c2));
        System.out.println("c1 <= c2 " + (c1 <= c2));

        //não é possível comparar grandeza entre Strings
//        System.out.println("s1 <= s2 " + (s1 <= s2));
//        System.out.println("s1 >= s2 " + (s1 >= s2));
        System.out.println("s1 == s2 " + (s1 == s2));
        System.out.println("s1 != s2 " + (s1 != s2));

        //não é possível comparar char e string
//        System.out.println("c1 != s2 " + (c1 != s2));
//        System.out.println("c1 >= s2 " + (c1 >= s2));
//        System.out.println("c1 >= s2 " + (c1 == s2));

        //não é possível comparar tipos diferentes como String e Boolean
//        System.out.println("b1 != s2 " + (b1 != s2));

        //não é possível comparar grandeza entre booleans
//        System.out.println("b1 > b2 " + (b1 > b2));

        System.out.println("b1 == b2 " + (b1 == b2));

        //é possível comparar int e float, porque os dois são tipos numéricos
        System.out.println("i1 == f2 " + (i1 == f2));

        //tipos numéricos podem ser comparados podem ser comparados
        System.out.println("h1 == y2 " + (h1 == y1));
        System.out.println("h1 >= y2 " + (h1 >= y1));
        System.out.println("l1 >= y2 " + (l1 >= y1));
    }
}
