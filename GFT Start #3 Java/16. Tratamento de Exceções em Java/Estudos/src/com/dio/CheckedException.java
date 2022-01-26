package com.dio;

import javax.swing.*;
import java.io.*;

//Imprimir um arquivo no console.
//FileReader throws an exception, então precisa tratar como checked exception
//Buffers e readLine() também lançam expections
public class CheckedException {
    //método main que resolve as exceptions, pois é o método chamador
    public static void main(String[] args) {
        String nomeDoArquivo = "romances-blake-crouch.txt";

        //tratamento de exceção
        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (FileNotFoundException e) { //precisa capturar a exceção exata para tratar
            //este catch trata erro de digitacao do nome do arquivo
            JOptionPane.showMessageDialog(null,
                    "Revise o nome do arquivo que você deseja imprimir! " + e.getCause());
           //e.printStackTrace();
        } catch (IOException e){ //classe mais genérica: PRECISA FICAR MAIS ABAIXO no tratamento do erro
            //este catch trata o erro na hora de imprimir, ler outra linha, descarregar, fechar arquivo
            e.printStackTrace(); //importante para mostrar o erro em específico
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro inesperado! Entre em contato com o suporte! " + e.getCause());
        } finally {
            System.out.println("Chegou no finally!");
        }

        System.out.println("Apesar da exception ou não, o programa continua...");
    }

    //IMPORTANTE: dá para fazer o tratamento dentro do void abaixo, sem precisar lançar a exceção
    //lançamento da exceção
    //IOExpection é mãe da FileNotFoundException, então é suficiente para resolver tanto
    //a exception lançada por FileReader(FileNotFoundException) como do método readLine(), que precisa da IOExpection)
    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        } while(line != null);

        //descarrega BufferedWriter e fecha BufferedReader
        bw.flush();
        br.close();
    }
}
