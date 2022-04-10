package Aula11;

public class Main {
    public static void main(String[] args) {

        //a classe não pode ser instanciada, porque é abstrata
//        Pessoa pessoa = new Pessoa();

        Visitante visitante = new Visitante();
        Aluno aluno = new Aluno();
        Bolsista bolsista = new Bolsista();

        visitante.setNome("Clóvis");
        visitante.setIdade(23);
        visitante.setGenero("M");
        System.out.println(visitante.toString());

        aluno.setNome("Ártemis");
        aluno.setGenero("F");
        aluno.setIdade(17);
        aluno.pagarMensalidade();
        System.out.println(aluno.toString());

        bolsista.setMatricula(222);
        bolsista.setNome("Joaquim");
        bolsista.setGenero("M");
        bolsista.setIdade(19);
        bolsista.pagarMensalidade();

    }
}
