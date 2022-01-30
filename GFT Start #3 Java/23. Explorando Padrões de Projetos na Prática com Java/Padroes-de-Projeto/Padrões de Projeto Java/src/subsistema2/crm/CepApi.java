package subsistema2.crm;

public class CepApi {

    //singleton
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    //método publico para ter acesso a instancia
    public String recuperarCidade(String cep) {
        return "Curitiba";
    }
    //método publico para ter acesso a instancia
    public String recuperarEstado(String cep) {
        return "PR";
    }
}
