package aula05;

public class Main {

    public static void main(String[] args) {

        Conta conta1 = new Conta();
        Conta conta2 = new Conta();

        conta1.abrirConta("cc", "Mia");
        System.out.println(conta1.getNumConta());
        conta2.abrirConta("cp", "Mimosa");
        System.out.println(conta2.getNumConta());

        conta1.sacar(200f);
        conta2.depositar(23f);

        conta1.pagarMensal();
        conta1.estadoAtual();
        conta2.pagarMensal();
        conta2.estadoAtual();

        conta1.fecharConta();
        conta1.sacar(38f);
        conta1.fecharConta();

        conta1.estadoAtual();
    }
}
