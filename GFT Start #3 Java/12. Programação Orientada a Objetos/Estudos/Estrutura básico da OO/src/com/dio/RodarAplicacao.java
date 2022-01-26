package com.dio;

public class RodarAplicacao {

    //ponto de entrar para a aplicação iniciar
    public static void main(String[] args) {

        //chamada construtor default Carro(), que não tem nenhum parâmetro;
        Carro carro1 = new Carro();

        //instanciando o objeto
        carro1.setCor("Azul");
        carro1.setModelo("BMW Série 3");
        carro1.setCapacidadeTanque(59);

        //usando getter para imprimir os valores
        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.39));

        //não precisou dos setters
        Carro carro2 = new Carro("Cinza", "Mercedes-Benz Classe C", 66);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.40));
    }
}
