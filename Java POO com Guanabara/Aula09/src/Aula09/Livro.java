package Aula09;

public class Livro implements Publicacao {

    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.leitor = leitor;
        this.totPaginas = totPaginas;
        this.setAberto(false);
        this.setPagAtual(0);
    }

    public String detalhes() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ",\n totPaginas=" + totPaginas +
                ", pagAtual=" + pagAtual +
                ",\n aberto=" + aberto +
                ",\n leitor=" + leitor.getNome() +
                ", idade=" + leitor.getIdade() +
                ", genero=" + leitor.getGenero() +
                '}';
    }

/*    public void detalhes() {
        System.out.println("O título do livro é " + this.titulo +
                ", escrito por " + this.autor);
        System.out.println("Tem um total de " + this.totPaginas +
                " e no momento " + this.leitor + " está na página " + this.pagAtual);
        if(this.aberto)
            System.out.println(this.leitor + " está lendo no momento.");
        else
            System.out.println(this.leitor + " não está lendo no momento.");
    }*/

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int pag) {
        if(pag > this.getTotPaginas())
            this.setPagAtual(0);
        else
            this.setPagAtual(pag);
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(getPagAtual() - 1);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
}
