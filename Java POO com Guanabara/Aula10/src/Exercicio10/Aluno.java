package Exercicio10;

public class Aluno extends Pessoa {

    private static int matricula = 0;
    private String curso;

    public void cancelarMatricula() {
        this.setMatricula(0);
    }

    public int getMatricula() {
        return matricula;
    }

    private void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
