package Aula12;

public class Peixe extends Animal {

    private String corEscama;

    public void soltarBolha() {
        System.out.println("Glub....");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando....");
    }

    @Override
    public void alimentar() {
        System.out.println("Ingerindo pequenas substâncias....");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não emite som!");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
