package projeto;

public class Gafanhoto extends Pessoa {

    private String login;
    private int totAssistido;


    public Gafanhoto(String nome, String genero, int idade,
                     String login) {
        super(nome, genero, idade);
        this.login = login;
        this.totAssistido = 0;
    }

    public void viuMaisUm() {
        this.totAssistido++;
        this.ganharExp();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() +
                ", login='" + login + '\'' +
                ", totAssistido=" + totAssistido +
                '}';
    }
}
