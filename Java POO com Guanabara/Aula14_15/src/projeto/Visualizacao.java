package projeto;

public class Visualizacao {

    private Gafanhoto visualizador;
    private Video filme;

    public Visualizacao(Gafanhoto visualizador, Video filme) {
        this.visualizador = visualizador;
        this.filme = filme;
        this.visualizador.setTotAssistido(this.visualizador.getTotAssistido() + 1);
        this.filme.setViews(filme.getViews() + 1);
    }

    public void avaliar() {
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(float porcentagem) {
        int total = 0;
        if(porcentagem <= 20)
            total = 3;
        else if(porcentagem <= 50)
            total = 5;
        else if(porcentagem <= 90)
            total = 8;
        else
            total = 10;
        this.filme.setAvaliacao(total);
    }

    public Gafanhoto getVisualizador() {
        return visualizador;
    }

    public void setVisualizador(Gafanhoto visualizador) {
        this.visualizador = visualizador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" +
                "visualizador=" + visualizador +
                ", filme=" + filme +
                '}';
    }
}
