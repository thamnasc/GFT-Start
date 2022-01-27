package me.dio;

//contrato que a classe é obrigada a implementar os métodos que existem na interface
public abstract interface CalculaBonificacao {

    //a implementação é feita na classe que chamar o método
    //o método sempre é público por padrão
    void calcularBonificacao(Double porcentagemBonificacao);

}
