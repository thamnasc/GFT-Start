package me.dio;

//extends --> herança
//implements --> interface
public class Vendedor extends FuncionarioCLT implements CalculaBonificacao {

    private Double valorBonificacao;

    //setter --> possibilita a inserção de propriedades nas variáveis

    //Construtores

    //construtor veio da classe mãe
    public Vendedor(String nome, String documento, Endereco endereco, Double valorSalario) {
        super(nome, documento, endereco, valorSalario);
    }

    @Override
    public void calcularBonificacao(Double porcentagemBonificacao) {
        this.valorBonificacao = super.getValorSalario() * porcentagemBonificacao;
        //poderia usar this no lugar de super, mas super é uma boa prática
    }

    public Double getValorBonificacao() {
        return valorBonificacao;
    }

    public void setValorBonificacao(Double valorBonificacao) {
        this.valorBonificacao = valorBonificacao;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", endereco=" + Endereco.getRua() + //imprimir só a rua
                ", valorSalario=" + valorSalario +
                ", valorBonificacao=" + valorBonificacao +
                '}';
    }
}
