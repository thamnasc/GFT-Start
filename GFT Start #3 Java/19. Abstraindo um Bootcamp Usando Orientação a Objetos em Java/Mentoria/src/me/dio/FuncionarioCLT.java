package me.dio;

//não é possível instanciar esta classe, vai ser vista apenas como base
public abstract class FuncionarioCLT {

    //protected para compartilhar com classes filhas
    protected String nome;
    protected String documento;

    //composição
    protected Endereco Endereco;

    protected Double valorSalario;

    public FuncionarioCLT(String nome, String documento, Endereco endereco, Double valorSalario) {
        this.nome = nome;
        this.documento = documento;
        this.Endereco = endereco;
        this.valorSalario = valorSalario;
    }

    public FuncionarioCLT() {
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
        return Endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.Endereco = endereco;
    }

    public Double getValorSalario() {
        return valorSalario;
    }

    public void setValorSalario(Double valorSalario) {
        this.valorSalario = valorSalario;
    }

    @Override
    public String toString() {
        return "FuncionarioCLT{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", endereco=" + Endereco +
                ", valorSalario=" + valorSalario +
                '}';
    }
}
