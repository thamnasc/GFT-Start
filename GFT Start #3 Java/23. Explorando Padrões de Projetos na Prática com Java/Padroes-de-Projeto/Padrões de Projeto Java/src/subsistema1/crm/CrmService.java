package subsistema1.crm;

public class CrmService {

    private CrmService() {
        super();
    }

    //método estático, não é preciso instanciar a classe
    public static void gravarCliente(String nome, String cep, String cidade, String estado) {
        System.out.println("Cliente salvo no sistema de CRM.");
        //verifica se o subsistema está funcionando
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }
}
