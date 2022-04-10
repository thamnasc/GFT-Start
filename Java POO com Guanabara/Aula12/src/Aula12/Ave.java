package Aula12;

public class Ave extends Animal {

    private String corPena;

    public void fazerNinho() {
        System.out.println("Levando gravetinho....");
    }

    @Override
    public void locomover() {
        System.out.println("Voando....");
    }

    @Override
    public void alimentar() {
        System.out.println("Bicando minhocas....");
    }

    @Override
    public void emitirSom() {
        System.out.println("Piando....");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
