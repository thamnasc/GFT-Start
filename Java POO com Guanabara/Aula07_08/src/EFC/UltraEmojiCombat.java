package EFC;

public class UltraEmojiCombat {

    public static void main(String[] args) {

        Lutador[] lutador = new Lutador[6];
        Luta[] EFC = new Luta[5];

        lutador[0] = new Lutador("Pretty Boy", "França", 31, 1.75f,
                                        68.9f, 11, 2, 1);

        lutador[1] = new Lutador("Putscript", "Brasil", 29, 1.68f,
                                        57.8f, 14, 2, 3);

        lutador[2] = new Lutador("Snapshadow", "Estados Unidos", 35, 1.65f,
                                        80.9f, 12, 2, 1);

        lutador[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f,
                                        81.6f, 13, 0, 2);

        lutador[4] = new Lutador("Ufocobol", "Brasil", 37, 1.7f,
                                        119.3f, 5, 4, 3);

        lutador[5] = new Lutador("Nerdaard", "Estados Unidos", 30, 1.81f,
                                        105.7f, 12, 2,4);

        EFC[0] = new Luta();
        EFC[1] = new Luta();
        EFC[2] = new Luta();
        EFC[3] = new Luta();
        EFC[4] = new Luta();

        //é aprovada, mesma categoria e lutadores diferentes
        EFC[0].marcarLuta(lutador[0], lutador[1]);
        EFC[0].lutar();

        //não é aprovada, categorias diferentes
        EFC[1].marcarLuta(lutador[2], lutador[1]);
        EFC[1].lutar();

        //é aprovada
        EFC[2].marcarLuta(lutador[2], lutador[3]);
        EFC[2].lutar();

        //é aprovada
        EFC[3].marcarLuta(lutador[4], lutador[5]);
        EFC[3].lutar();

        lutador[0].setPeso(50f);
        //não é aprovada, jogador inválido
        EFC[0].marcarLuta(lutador[0], lutador[1]);
        EFC[0].lutar();

        //não aprovada, mesmo jogador
        EFC[4].marcarLuta(lutador[5], lutador[5]);
        EFC[4].lutar();

        lutador[0].status();
    }
}
