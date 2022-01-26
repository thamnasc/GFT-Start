package com.dio;

//cria a classe
public class Carro {

    //criado atributos
    String cor;
    String modelo;
    int capacidadeTanque;

    //construtor aqui
    //fazendo a sobrecarga do construtor

    //o que é feito por baixo dos panos, é uma boa prática fazer, mas não é necessário
    Carro() {

    }

    //para definir atributos iniciais
    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    //ao criar objetos, o this é uma forma de diferenciar o que pertence ou não ao objeto

    /* boas práticas:
    os construtores devem estar sempre abaixo dos atributos,
    depois setter e getter e após métodos de negócios (os mais complexos)
    ficam por último */

    //setter
    void setCor(String cor) {
        this.cor = cor;
    }

    //getter
    String getCor() {
        return cor;
    }

    //setter --> colocar valor no atributo
    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //getter --> retorne o atributo
    String getModelo() {
        return modelo;
    }

    //setter
    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    //getter
    int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    double totalValorTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }
}
