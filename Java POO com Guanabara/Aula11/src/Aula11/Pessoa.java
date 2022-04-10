package Aula11;

//ascendente de bolsista (tem correlação com herança, mas não é mãe,
// é "avó" por exemplo)
//a classe não pode ser instanciada
public abstract class Pessoa {

    //protected para as filhas terem acesso
    protected String nome, genero;
    protected int idade;

    //as classes filhas não podem fazer sobrescrita no método
    public final void fazerAniversario() {
        this.idade++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", idade=" + idade +
                '}';
    }
}
