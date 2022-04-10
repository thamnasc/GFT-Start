package Exercicio10;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        Funcionario funcionario = new Funcionario();

        pessoa.setNome("Joana");
        aluno.setNome("Carol");
        professor.setNome("Maria");
        funcionario.setNome("Bruna");

        aluno.setCurso("Técnica em Eletrônica");
        professor.setSalario(2500.75f);
        funcionario.setSetor("ADM");

        System.out.println(pessoa.toString());
        System.out.println(aluno.toString());
        System.out.println(professor.toString());
        System.out.println(funcionario.toString());
        
        //não funciona dessa forma, os métodos de subclasses não são
        //misturados e os métodos de subclasses não são levados para a superclasse
/*        pessoa.receberAum(550f);
        aluno.mudarTrabalho();
        funcionario.cancelarMatricula();*/
    }
}
