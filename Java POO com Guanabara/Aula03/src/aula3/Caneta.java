package aula3;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    void status() {
        System.out.print("Uma caneta " + this.cor.toLowerCase());
        System.out.print(" do modelo " + this.modelo);
        System.out.print(", de ponta " + this.ponta);
        System.out.print(", está com carga " + this.carga + "%");
        if(this.tampada)
            System.out.println(" e está tampada.");
        else
            System.out.println(" e está destampada.");
    }

    private void rabiscar() {
        if(this.tampada)
            System.out.println("Não posso rabiscar!");
        else
            System.out.println("Rabiscando....");
    }

    //funciona tampar e destampar porque os métodos são
    //públicos e estão modificando o atributo dentro da classe
    //então o private deixa alterar o status do objeto
    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}
