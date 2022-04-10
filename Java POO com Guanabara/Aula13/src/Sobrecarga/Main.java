package Sobrecarga;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();

        cachorro.reagir("Vem comer!");
        cachorro.reagir("Sai!");
        cachorro.reagir(10, 15);
        cachorro.reagir(22, 0);
        cachorro.reagir(true);
        cachorro.reagir(false);
        cachorro.reagir(2, 5f);
        cachorro.reagir(12, 6f);
    }
}
