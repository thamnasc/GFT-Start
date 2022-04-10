package Aula11;

//bolsista é descendente de Pessoa (o descente não pode ser classe filha,
// mas "neta")
public class Bolsista extends Aluno {

    private int bolsa;

    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.nome + "....");
    }

    //sobrescrita do método da classe mãe
    //polimorfismo
    @Override
    public void pagarMensalidade() {
        System.out.println(this.nome + " é bolsista. O pagamento está recebendo desconto.");
    }
}
