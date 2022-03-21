package aula2;

import java.util.Locale;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.print("Uma caneta " + this.cor.toLowerCase());
        System.out.print(" do modelo " + this.modelo);
        System.out.print(", de ponta " + this.ponta);
        System.out.print(", está com carga " + this.carga + "%");
        if(this.tampada)
            System.out.println(" e está tampada.");
        else
            System.out.println(" e está destampada.");
    }

    void rabiscar() {
        if(this.tampada)
            System.out.println("Não posso rabiscar!");
        else
            System.out.println("Rabiscando....");
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}
