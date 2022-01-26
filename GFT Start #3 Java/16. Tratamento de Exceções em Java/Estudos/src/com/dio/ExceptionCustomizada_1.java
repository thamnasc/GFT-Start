package com.dio;

import javax.swing.*;
import java.io.*;

public class ExceptionCustomizada_1 {
    public static void main(String[] args) {
        String nomeDoArquivo = JOptionPane.showInputDialog("Nome do arquivo a ser exibido: ");

        imprimirArquivoNoConsole(nomeDoArquivo);
        System.out.println("\nCom exception ou não, o programa continua...");
    }

    //não foi lançada a exceção, foi tratada dentro do método
    //foi feito desacoplamento: leitura separada de impressão
    //por isso não é mais necessário capturar exception FileNotFoundException
    public static void imprimirArquivoNoConsole(String nomeDoArquivo) {

        try {
            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);
            bw.flush();
            br.close();
        } catch (ImpossivelAberturaDeArquivoException e) {
            JOptionPane.showMessageDialog(null,
                    e.getMessage()); //passa mensagem criada na classe de Exception criada lá embaixo
            //e.printStackTrace();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro não esperado, por favor, fale com o suporte." + ex.getMessage());
            ex.printStackTrace();
        }
    }

    //o tratamento da exceção é feito aqui dentro
    //tratamento de exceção customizado
    public static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAberturaDeArquivoException {

        File file = new File(nomeDoArquivo);
        try {
            return new BufferedReader(new FileReader(nomeDoArquivo));
        } catch (FileNotFoundException e) { //métodos são da classe file getName() e getPath()
            throw new ImpossivelAberturaDeArquivoException(file.getName(), file.getPath());
        }

        //outra forma
        /*try(BufferedReader br = new BufferedReader(new FileReader(nomeDoArquivo))) {

        } finally {
            System.out.println();
        }*/
    }
}

//criar abaixo da classe para não precisar criar outro arquivo
//exception customizada;
//é uma classe java, tem atributo, métodos, pode sobrescrever métodos
class ImpossivelAberturaDeArquivoException extends Exception {

    private String nomeDoArquivo;
    private String diretorio;

    //construtor
    //cria mensagem, mas podia ser passado por parâmetro String message e dentro escrever super(message)
    public ImpossivelAberturaDeArquivoException(String nomeDoArquivo, String diretorio) {
        super("O arquivo " + nomeDoArquivo + " não foi encontrado no diretório " + diretorio);
        this.nomeDoArquivo = nomeDoArquivo;
        this.diretorio = diretorio;
    }

    //sobrescreve o toString() da classe Exception
    //se não, imprimiria o método toString() de Exception como padrão
    @Override
    public String toString() {
        return "ImpossivelAberturaDeArquivoException{" +
                "nomeDoArquivo='" + nomeDoArquivo + '\'' +
                ", diretorio='" + diretorio + '\'' +
                '}';
    }

    //poderia sobrescresver outros métodos, como getCause()
}

