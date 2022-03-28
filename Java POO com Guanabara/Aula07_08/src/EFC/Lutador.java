package EFC;

public class Lutador {

    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;

    public Lutador(String nome, String nacionalidade, int idade, float altura,
                   float peso, int vitorias, int derrotas, int empates) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.getPeso() < 52.2)
            this.categoria = "inválido";
        else if(this.getPeso() <= 70.3)
            this.categoria = "leve";
        else if(this.getPeso() <= 83.9)
            this.categoria = "médio";
        else if(this.getPeso() <= 120.2)
            this.categoria = "pesado";
        else
            this.categoria = "inválido";
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void apresentar() {
        System.out.println("Está entrando no ring o " + this.getNome() + "!");
        switch (this.getCategoria()) {
            case "leve":
                System.out.print("Este garotão ");
                break;
            case "médio":
                System.out.print("Este grandalhão ");
                break;
            case "pesado":
                System.out.print("Este peso pesado ");
                break;
        }
        if(this.getNacionalidade().endsWith("a"))
            System.out.print("veio da " + this.getNacionalidade());
        else if(this.getNacionalidade().endsWith("s"))
            System.out.print("veio dos " + this.getNacionalidade());
        else
            System.out.print("veio do " + this.getNacionalidade());
        System.out.printf(", tem %d anos, %.2fm e %.2fkg!!!", this.getIdade(), this.getAltura(), this.getPeso());
        System.out.printf(" Tem %d vitórias, %d empates e %d derrotas!\n", this.getVitorias(), this.getEmpates(),
                                                                            this.getDerrotas());
        System.out.println("------------------------------");
    }

    public void status() {
        System.out.print("O lutador " + this.getNome());
        System.out.println(" é um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Empatou " + this.getEmpates() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes!\n");
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
}
