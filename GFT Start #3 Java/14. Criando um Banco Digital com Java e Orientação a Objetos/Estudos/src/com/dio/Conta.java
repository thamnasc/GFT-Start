package com.dio;

/* deixar a classe abstrata para que ela (sendo classe genérica) não seja instanciada
*  por nenhuma outra além de suas filhas
* */
public abstract class Conta implements InterfaceConta {

    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    //por padrão, no Java, mantém-se privado até que seja necessário expor esses atributos
    //estes dados são identificações pessoais, então manter como protected é o correto
    //é preciso manter ao menos protected para as classes filhas terem acesso aos atributos
    //isso ajudaria contra possíveis vazamentos de dados
    protected int agencia;
    protected int numero;
    protected double saldo;
    //associação: cliente compõe a conta
    protected Cliente cliente;

    //construtor
    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        //toda vez que cria conta, aumenta uma unidade
        this.numero = SEQUENCIAL ++;
        this.cliente = cliente;
    }

    //o setter não é adequado neste caso, porque poderia haver reatribuição

    //getters
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    //métodos precisam ser públicos para o usuário ter acesso
    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        //saque na conta utilizada
        this.sacar(valor);
        //depósito na conta destino
        contaDestino.depositar(valor);
    }
}
