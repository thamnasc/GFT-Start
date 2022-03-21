package aula2;

public class Main {
    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Rosa";
        c1.carga = 55;
        c1.ponta = 0.7f;
        c1.tampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.cor = "Roxa";
        c2.destampar();
        c2.rabiscar();
    }
}
