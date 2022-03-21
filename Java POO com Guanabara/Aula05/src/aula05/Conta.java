package aula05;

public class Conta {

    private static int SEQUENCIAL = 1;

    private float saldo;
    public int numConta = 0;
    protected String tipo;
    private String dono;
    private boolean status;

    public Conta() {

        this.setStatus(false);
        this.setSaldo(0f);
        this.setNumConta(SEQUENCIAL ++);
    }

    public void abrirConta(String tipo, String dono) {

        if(tipo.equals("cp"))
            this.setSaldo(150f);
        else if(tipo.equals("cc"))
            this.setSaldo(50f);
        this.setTipo(tipo);
        this.setDono(dono);
        this.setStatus(true);
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {

        if (this.getSaldo() > 0)
            System.out.println("Você tem R$" + this.getSaldo() + " na sua conta. Um saque precisa ser feito antes de fechá-la.");
        else if (this.getSaldo() < 0)
            System.out.println("Você tem R$" + this.getSaldo() + " a quitar. Não pode fechar a conta antes disso.");
        else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }
    }

    public void depositar(float quantia) {

        if(this.getStatus())
            this.setSaldo(this.getSaldo() + quantia);
        else
            System.out.println("Impossível depositar em uma conta fechada.");
    }

    public void sacar(float quantia) {

        if(this.getStatus()) {
            if(this.getSaldo() >= quantia)
                this.setSaldo(getSaldo() - quantia);
            else
                System.out.println("Saldo insuficiente.");
        }
        else
            System.out.println("Impossível sacar em uma conta fechada.");
    }

    public void pagarMensal() {

        int valor;
        if(this.getTipo().equals("cc"))
            valor = 12;
        else
            valor = 20;

        if(this.getStatus()) {
            if(this.getSaldo() > valor)
                this.setSaldo(this.getSaldo() - valor);
            else
                System.out.println("Saldo insuficiente.");
        }
        else
            System.out.println("Impossível pagar a mensalidade de uma conta fechada.");
    }

    public float getSaldo() {

        return saldo;
    }

    public void setSaldo(float saldo) {

        this.saldo = saldo;
    }

    public int getNumConta() {

        return numConta;
    }

    public void setNumConta(int numConta) {

        this.numConta = numConta;
    }

    public String getTipo() {

        return tipo;
    }

    public void setTipo(String tipo) {

        this.tipo = tipo;
    }

    public String getDono() {

        return dono;
    }

    public void setDono(String dono) {

        this.dono = dono;
    }

    public boolean getStatus() {

        return status;
    }

    public void setStatus(boolean status) {

        this.status = status;
    }

    public void estadoAtual() {

        System.out.println("--------------");
        System.out.println("Conta: " + this.getNumConta());
        if(getTipo().equals("cp"))
            System.out.println("Tipo: Conta Corrente");
        else
            System.out.println("Tipo: Conta Poupança");
        System.out.println("Dono(a): " + this.getDono());
        System.out.println("Saldo: R$" + this.getSaldo());
        if(getStatus())
            System.out.println("Status: Aberta");
        else
            System.out.println("Status: Fechada");
        System.out.println("--------------");
    }
}
