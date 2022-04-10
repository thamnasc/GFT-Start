package Aula12;

public class Mamifero extends Animal {

    private String corPelo;

    //sobreposição --> polimorfismo
    //várias formas de se ter um método com mesma assinatura do método
    //assinatura é quantidade e tipos de parâmetros
    @Override
    public void locomover() {
        System.out.println("Andando....");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando....");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som de mamífero....");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
