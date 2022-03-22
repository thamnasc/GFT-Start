
public class Main {
    public static void main(String[] args) {

        ControleRemoto controle = new ControleRemoto();
        controle.ligar();
        controle.maisVolume();
        controle.ligarMudo();
        controle.abrirMenu();

        controle.play();
        controle.desligarMudo();
        controle.maisVolume();
        controle.abrirMenu();
        controle.fecharMenu();

        controle.pause();
        controle.desligar();
        controle.maisVolume();
        controle.menosVolume();
        controle.play();
        controle.abrirMenu();
    }
}
