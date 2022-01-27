package me.dio;

//Sistema de gerenciamento de colaboradores

//Exercício:
//Criar entidade e bonificação de colaboradores
//Implementa o que o cliente quer, as regras já foram dadas

//Abstração: imaginar o mundo real e pegar as principais características
//que realmente importam e implementar na aplicação
public class Main {

    //jvm procura direto pelo método main para executar o programa
    public static void main(String[] args) {

        //instanciando objetos: criar objeto na memória

        Endereco endereco = new Endereco("rua1", "complemento rua1", "bairro1");

        //construtor vazio
        //Vendedor vendedor = new Vendedor();
        //vendedor.setNome("vendedor");

        Vendedor vendedor = new Vendedor("vendedor", "111.111.111-11", endereco, 1000d);
        vendedor.calcularBonificacao(0.1d);
        System.out.println(vendedor);

        OperadorDeCaixa operador = new OperadorDeCaixa("operador", "111.111.111-11", endereco, 1000d);
        System.out.println(operador);

        Gerente gerente = new Gerente();
        System.out.println(gerente);
        gerente.setNome("Gerente");
        gerente.setDocumento("11.111.111/0001-11");
        gerente.setHorasTrabalhadas(41);
        gerente.setValorHora(50d);
        gerente.setEndereco(endereco);

        gerente.calculaRemuneracao();
        gerente.calcularBonificacao(0.2);

        System.out.println(gerente);
    }
}
