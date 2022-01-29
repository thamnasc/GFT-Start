package dio.com;

/*Dadas as seguintes informações sobre minhas séries favoritas,
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de episódio);
Série 1 = Nome: atypical, genero: ficção científica, tempoEpisodio: 45
Série 2 = Nome: stranger things, genero: comédia dramática, tempoEpisodio: 45
Série 3 = Nome: the witcher, genero: drama, tempoEpisodio: 45
*/

import dio.com.ordenacao.Serie;

import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("atypical", "fantasia", 45));
            add(new Serie("stranger things", "comédia dramática", 45));
            add(new Serie("the witcher", "drama", 45));
        }};
        for(Serie serie : minhasSeries) System.out.println(serie.getNome() + " - " +
                serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("--\tOrdem inserção\t--");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("atypical", "fantasia", 45));
            add(new Serie("stranger things", "comédia dramática", 45));
            add(new Serie("the witcher", "drama", 45));
        }};
        for(Serie serie : minhasSeries1) System.out.println(serie.getNome() + " - " +
                serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("--\tOrdem natural\t (TempoEpisodio)--");
        Set<Serie> minhaSeries2 = new TreeSet<>(minhasSeries1); //poderia ser minhasSeries2
        //precisa implementar comparable
        for(Serie serie : minhaSeries2) System.out.println(serie.getNome() + " - " +
                serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("--\tOrdem Nome/Gênero/TempoEpisodio\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries); //vai ser organizada conforme o Comparator
        for(Serie serie : minhasSeries3) System.out.println(serie.getNome() + " - " +
                serie.getGenero() + " - " + serie.getTempoEpisodio());

        //Exercícios
        System.out.println("--\tOrdem gênero\t--");
        //ordena por gênero, se não, ordena por nome
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorGenero());
        minhasSeries4.addAll(minhasSeries);
        for(Serie serie : minhasSeries4) System.out.println(serie.getNome() + " - " +
                serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("--\tOrdem Tempo do Episódio\t--");
        //ordena por tempo, se não, ordena por gênero
        Set<Serie> minhasSeries5 = new TreeSet<>(new ComparatorTempoEpisodio());
        minhasSeries5.addAll(minhasSeries);
        for(Serie serie : minhasSeries5) System.out.println(serie.getNome() + " - " +
                serie.getGenero() + " - " + serie.getTempoEpisodio());
    }
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {

        int nome = s1.getNome().compareTo(s2.getNome());
        if(nome != 0) return nome; // 0 = igual

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if(genero != 0) return genero; // 0 = igual

        //se não:
        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}

class ComparatorGenero implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        int genero = s1.getGenero().compareTo(s2.getGenero());
        if(genero != 0) return genero;

        return s1.getNome().compareTo(s2.getNome());
    }
}

class ComparatorTempoEpisodio implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        int tempoEpisodio = s1.getTempoEpisodio().compareTo(s2.getTempoEpisodio());
        if(tempoEpisodio != 0) return tempoEpisodio;

        return s1.getGenero().compareTo(s2.getGenero());
    }
}