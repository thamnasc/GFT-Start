package com.dio;

import java.io.IOException;
import java.util.Scanner;

public class Problem {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);

        while(leitor.hasNext()) {
            String alphabet = leitor.next();
            String word = "";
            int letters = leitor.nextInt();

            for(int i = 0; i < letters; i++) {
                int letter = leitor.nextInt();
                word += alphabet.charAt(letter - 1);
            }

            System.out.println(word);
        }
    }
}