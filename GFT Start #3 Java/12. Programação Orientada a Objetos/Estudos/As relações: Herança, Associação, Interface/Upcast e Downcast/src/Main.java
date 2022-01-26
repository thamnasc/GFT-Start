public class Main {
    public static void main(String[] args) {

        //instanciando objeto
        Funcionario funcionario = new Funcionario();

        //upcast --> sempre implícito
        //facilita muito o polimorfismo
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //downcast --> precisa ser explícito
        //tentando transformar a classe mãe (funcionário) em filha (venddor)
        //pode haver perda de dados
        //programa não sabe o que fazer com o que há em funcionário, mas não em vendedor
        //downcast deve ser evitado
        Vendedor vendedor_ = (Vendedor) new Funcionario();

    }
}
