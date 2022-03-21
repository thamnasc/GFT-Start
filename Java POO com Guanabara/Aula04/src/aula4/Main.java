package aula4;

public class Main {
    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        //usou o método acessor
        c1.setModelo("BIC");
        //acessou diretamente o atributo
        c1.modelo = "BIC";

        c1.setPonta(0.5f);
        //não acessa diretamente porque é um atributo privado
//        c1.ponta = 0.5f;


        //não deixa fazer acesso diretamente, porque é privado
//        System.out.println("Tenho uma caneta " + c1.ponta);
        //o acesso é feito pelo getter
        System.out.println("Tenho uma caneta " + c1.getModelo() + " " + c1.getPonta());
        System.out.println("~~~~~~~~~~~~");

        //recebe a cor rosa e é tampada por default
        Caneta c2 = new Caneta();
        c2.status();

        System.out.println("~~~~~~~~~~~~");
        Caneta c3 = new Caneta("FaberCastell", 1.0f, "Preta");
        c3.status();
    }
}
