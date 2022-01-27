package me.dio;

//quando começa a copiar demais o código, é bom se atentar
//bad smells
//pensar em herança
public class OperadorDeCaixa extends FuncionarioCLT{

    //estão como default o modificador de visibilidade
    //é preciso alterar o modificador para ENCAPSULAR os atributos
    private Double valorBonificacao;

    public OperadorDeCaixa(String nome, String documento, Endereco endereco, Double valorSalario) {
        super(nome, documento, endereco, valorSalario);
    }

    public Double getValorBonificacao() {
        return valorBonificacao;
    }

    public void setValorBonificacao(Double valorBonificacao) {
        this.valorBonificacao = valorBonificacao;
    }

    @Override
    public String toString() {
        return "OperadorDeCaixa{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", endereco=" + Endereco.getRua() + //printa só a rua
                ", valorSalario=" + valorSalario +
                ", valorBonificacao=" + valorBonificacao +
                '}';
    }
}
