/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.dio.linguagem;

import java.util.Locale;


public class Linguagem {
    
    public static void main(String[] args) {
        Locale localidade = Locale.getDefault();
        System.out.println("O idioma do sistema é:");
        System.out.println(localidade.getDisplayLanguage());
    }
    
}
