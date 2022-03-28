package EFC;

import java.util.Random;

public class Luta {

    //agregação: tipo de relacionamento "tem um"
    //A classe B tem um atributo da classe A
    //é um tipo abstrato de dado
    private Lutador desafiado, desafiante;
    int rounds;
    boolean aprovada;

    /* Regras da Luta:
     * Só pode ser marcada entre lutadores da mesma categoria
     * Desafio e desafiante devem ser lutadores diferentes
     * Só pode acontecer se a luta estiver aprovada
     * Só pode ter como resultado a vitória de um ou o empate de ambos
     */
    public void marcarLuta(Lutador l1, Lutador l2) {

        //se um não for inválido, já basta
        //porque testa se os dois são iguais
        if(!l1.getCategoria().equals("inválido") &&
                //lutadores diferentes
                l1 != l2 &&
                l1.getCategoria().equals(l2.getCategoria())) {

            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }
        else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {

        Random aleatorio = new Random();
        int vencedor;

        if(aprovada) {
            System.out.println("=====A luta foi iniciada!=====");
            System.out.println("Desafiado: ");
            desafiado.apresentar();
            System.out.println("Desafiante: ");
            desafiante.apresentar();
            vencedor = aleatorio.nextInt(3); // 0 1 2
            System.out.println("=====Resultado=====");
            switch(vencedor) {
                case 0:
                    System.out.println(desafiado.getNome() + " ganhou!");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 1:
                    System.out.println(desafiante.getNome() + " ganhou!");
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    break;
                case 2:
                    System.out.println("Empate!");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                default:
                    System.out.println("Acontecimento inesperado.");
            }
        }
        else
            System.out.println("A luta não está aprovada.");
        System.out.println("===================");
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean setAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
