package com.dio.resolucao;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Resolucao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimensao = toolkit.getScreenSize();
        System.out.println("A resolução da tela é: " + dimensao.width + "X" +
                dimensao.height);
    }
    
}
