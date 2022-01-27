package me.dio;

public class Gerente implements CalculaBonificacao {

    private String nome;
    private String documento;
    private Endereco endereco;
    private Integer horasTrabalhadas;
    private Double valorBonificacao;
    private Double valorRemunecao;
    private Double valorHora;

    public Gerente() {
    }

    public Gerente(String nome, String documento, Endereco endereco, Integer horasTrabalhadas) {
        this.nome = nome;
        this.documento = documento;
        this.endereco = endereco;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public void calcularBonificacao(Double porcentagemBonificacao) {
        this.valorBonificacao = this.valorRemunecao * porcentagemBonificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double getValorBonificacao() {
        return valorBonificacao;
    }

    public void setValorBonificacao(Double valorBonificacao) {
        this.valorBonificacao = valorBonificacao;
    }

    public Double getValorRemunecao() {
        return valorRemunecao;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public void setValorRemunecao(Double valorRemunecao) {
        this.valorRemunecao = valorRemunecao;
    }

    public void calculaRemuneracao() {
        this.valorRemunecao = horasTrabalhadas * valorHora;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", endereco=" + endereco +
                ", horasTrabalhadas=" + horasTrabalhadas +
                ", valorBonificacao=" + valorBonificacao +
                ", valorRemunecao=" + valorRemunecao +
                ", valorHora=" + valorHora +
                '}';
    }
}
