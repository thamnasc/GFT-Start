package Aula09;

public class ProjetoLivro {
    public static void main(String[] args) {

        Pessoa[] pessoa = new Pessoa[2];
        Livro[] livro = new Livro[3];

        pessoa[0] = new Pessoa("Maria", "feminino", 17);
        pessoa[1] = new Pessoa("João", "masculino", 15);

        livro[0] = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 135, pessoa[0]);
        livro[1] = new Livro("O Senhor dos Anéis", "J. R. R. Tolkien", 1200, pessoa[1]);
        livro[2] = new Livro("O Universo numa Casca de Noz", "Stephen Hawking", 312, pessoa[0]);

        livro[0].abrir();
        livro[0].folhear(35);
        livro[0].avancarPag();
        System.out.println(livro[0].detalhes());

        System.out.println(livro[1].detalhes());
    }
}
