public class PessoaRadiante extends Pessoa {

    public PessoaRadiante(String nome) {
        super.nome = nome;
    }

    @Override
    public void finalizarBootcamp() {
       System.out.println(this.nome + " finalizou o Bootcamp GFT Start #3 Java e está radiante!");
    }
}
