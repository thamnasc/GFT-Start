package com.dio.gof.strategy;

public class Robo {

    private Comportamento comportamento;

    //para mudar a estratégia de comportamento
    public void setComportamento (Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    //garante que o robô se move
    //delega a função de se mover para a strategy
    public void mover() {
        comportamento.mover();
    }
}
