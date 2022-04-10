package projeto;

public abstract class Pessoa {

    protected String nome, genero;
    protected int idade;
    protected float experiencia;

    public Pessoa(String nome, String genero, int idade) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.experiencia = 0;
    }

    protected void ganharExp() {
        this.experiencia++;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getIdade() {
        return idade;
    }

    public float getExperiencia() {
        return experiencia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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
                ", experiencia=" + experiencia +
                '}';
    }
}
