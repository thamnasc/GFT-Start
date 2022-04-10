package projeto;

public class ProjetoYoutube {

    public static void main(String[] args) {

        Video[] video = new Video[3];

        video[0] = new Video("Projeto Final em Java");
        video[1] = new Video("Aula 10 Herança");
        video[2] = new Video("Aula 12 Polimorfismo");

        System.out.println(video[0].toString());

        Gafanhoto[] gafanhoto = new Gafanhoto[2];
        gafanhoto[0] = new Gafanhoto("Maria Fernanda", "F", 15, "mafe");
        gafanhoto[1] = new Gafanhoto("Jubileu", "M", 17, "jubs");

        System.out.println(gafanhoto[0].toString());
        System.out.println(gafanhoto[1].toString());

        Visualizacao visualizacao = new Visualizacao(gafanhoto[0], video[1]);
        visualizacao.avaliar();
        System.out.println(visualizacao.toString());
        Visualizacao visualizacao1 = new Visualizacao(gafanhoto[1], video[1]);
        visualizacao.avaliar(8);
        System.out.println(visualizacao1.toString());
    }
}
