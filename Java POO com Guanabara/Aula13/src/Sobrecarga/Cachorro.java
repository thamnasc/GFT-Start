package Sobrecarga;

public class Cachorro extends Lobo {

    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }

    //sobrecarga: métodos com assinatura diferente na mesma classe
    //assinatura de um método: quantidade e tipo de parâmetros
    //o tipo de retorno não importa, só tem a ver com a assinatura
    //os nomes do parâmetros podem ser diferentes,
    //mas se forem do mesmo tipo e na mesma quantidade, dá erro
    public void reagir(String frase) {
        if(frase.equals("Pega o graveto") ||
                frase.equals("Vem comer!"))
            System.out.println("Abanando o rabo e latindo");
        else
            System.out.println("Rosnando");
    }

    public void reagir(int hora, int min) {
        if(hora < 12)
            System.out.println("Abanando o rabo");
        else if(hora < 18)
            System.out.println("Abanando o rabo e latindo");
        else
            System.out.println("Ignorando");
    }

    public void reagir(boolean dono) {
        if(dono)
            System.out.println("Abanando o rabo");
        else
            System.out.println("Rosnando e latindo");
    }

    public void reagir(int idade, float peso) {
        if(idade < 6) {
            if(peso < 15)
                System.out.println("Abanando o rabo");
            else
                System.out.println("Latindo");
        }
        else
            if(peso < 15)
                System.out.println("Rosnando");
            else
                System.out.println("Ignorando");
    }
}
