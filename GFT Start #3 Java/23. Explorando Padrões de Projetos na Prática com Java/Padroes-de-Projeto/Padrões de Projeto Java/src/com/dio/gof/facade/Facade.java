package com.dio.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.crm.CepApi;

public class Facade {

    //base de clientes que vai ser migrada para uma nova base
    //no momento só tem nome e CEP
    //a ideia é que o Facade complemente os dados do cliente

    public void migrarCliente(String nome, String cep) {

        //torna a interface mais coesa e adequada para o consumo
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
